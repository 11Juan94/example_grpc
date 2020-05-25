package com.smarter;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.google.common.util.concurrent.ListenableFuture;
import com.smarter.grpc.ExampleServiceGrpc;
import com.smarter.grpc.ExampleGrpc.SimpleMessage;
import com.smarter.grpc.ExampleGrpc.SimpleResponse;
import com.smarter.grpc.ExampleServiceGrpc.ExampleServiceFutureStub;
import com.smarter.grpc.ExampleServiceGrpc.ExampleServiceStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

public class Client {
    private static Logger logger = Logger.getLogger(App.class.getName());
    private static Random rand = new Random();
    private static ManagedChannel channel;
    public static void main(String[] args) {
        try {
            logger.log(Level.INFO, "Client starting...");
            channel = ManagedChannelBuilder.forTarget("127.0.0.1:50050").usePlaintext().build();
            SendSimpleRequest("Ejemplo del mensaje");
            SendSimplesRequests(20);
            logger.log(Level.INFO, "Client done");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Can't contact with server", e);
        }
    }

    public static void SendSimpleRequest(String mensaje)
            throws InterruptedException, ExecutionException {
        ExampleServiceFutureStub stub = ExampleServiceGrpc.newFutureStub(channel);
        ListenableFuture<SimpleResponse> response = stub.simpleRPC(SimpleMessage.newBuilder().setMessage(mensaje).build());
        SimpleResponse datoRespuesta = response.get();
        System.out.println(datoRespuesta.getResponse());
    }

    public static void SendSimplesRequests(int number) throws InterruptedException {
        final CountDownLatch finishLatch = new CountDownLatch(1);
        ExampleServiceStub stub = ExampleServiceGrpc.newStub(channel);
        StreamObserver<SimpleResponse> responseObserver = new StreamObserver<SimpleResponse>() {
          @Override
          public void onNext(SimpleResponse response) {
            logger.log(Level.INFO, "Got message: " + response.getResponse());
          }
      
          @Override
          public void onError(Throwable t) {
            Status status = Status.fromThrowable(t);
            logger.log(Level.WARNING, "RecordRoute Failed: {0}", status);
            finishLatch.countDown();
          }
      
          @Override
          public void onCompleted() {
            logger.info("Finished RecordRoute");
            finishLatch.countDown();
          }
        };
      
        StreamObserver<SimpleMessage> requestObserver = stub.simpleRPCs(responseObserver);
        try {
          for (int i = 0; i < number; ++i) {
            int index = rand.nextInt(5000);
            SimpleMessage req = SimpleMessage.newBuilder().setMessage("Message random" + index).build();
            requestObserver.onNext(req);
            // Sleep for a bit before sending the next one.
            Thread.sleep(rand.nextInt(1000) + 500);
            if (finishLatch.getCount() == 0) {
              // RPC completed or errored before we finished sending.
              // Sending further requests won't error, but they will just be thrown away.
              return;
            }
          }
        } catch (RuntimeException e) {
          // Cancel RPC
          requestObserver.onError(e);
          throw e;
        }
        // Mark the end of requests
        requestObserver.onCompleted();
      
        // Receiving happens asynchronously
        finishLatch.await(1, TimeUnit.MINUTES);
      }
      

}