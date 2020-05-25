package com.smarter.implementations;

import com.smarter.grpc.ExampleServiceGrpc.ExampleServiceImplBase;

import io.grpc.stub.StreamObserver;

import java.util.UUID;

import com.smarter.grpc.ExampleGrpc.ComplexMessage;
import com.smarter.grpc.ExampleGrpc.ComplexResponse;
import com.smarter.grpc.ExampleGrpc.SimpleMessage;
import com.smarter.grpc.ExampleGrpc.SimpleResponse;

public class ExampleServerImpl extends ExampleServiceImplBase {
    private static UUID IdServidor = UUID.randomUUID();
    @Override
    public void simpleRPC(SimpleMessage request, StreamObserver<SimpleResponse> responseObserver) {
        responseObserver.onNext(SimpleResponse.newBuilder()
            .setResponse("Hola, yo soy " + IdServidor.toString() + ". Tu mensaje enviado fue: " + request.getMessage())
            .build()
            );
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<SimpleMessage> simpleRPCs(StreamObserver<SimpleResponse> responseObserver) {
        return new StreamObserver<SimpleMessage>() {

            @Override
            public void onNext(SimpleMessage request) {
                responseObserver.onNext(SimpleResponse.newBuilder()
                    .setResponse("Tu mensaje enviado fue: " + request.getMessage())
                    .build()
                );

            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onCompleted();
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
            
        };
      
    }

    @Override
    public void complexRPC(ComplexMessage request, StreamObserver<ComplexResponse> responseObserver) {
        
    }

    @Override
    public StreamObserver<ComplexMessage> complexRPCs(StreamObserver<ComplexResponse> responseObserver) {
        return new StreamObserver<ComplexMessage>() {

            @Override
            public void onNext(ComplexMessage value) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onCompleted() {
                // TODO Auto-generated method stub

            }
            
        };
    }

    @Override
    public StreamObserver<SimpleMessage> sayHi(StreamObserver<SimpleResponse> responseObserver) {
        return new StreamObserver<SimpleMessage>() {

            @Override
            public void onNext(SimpleMessage value) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onError(Throwable t) {
                // TODO Auto-generated method stub

            }

            @Override
            public void onCompleted() {
                // TODO Auto-generated method stub

            }
            
        };
      
    }
}