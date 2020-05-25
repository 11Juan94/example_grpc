package com.smarter.grpc;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: examples.proto")
public class ExampleServiceGrpc {

  private ExampleServiceGrpc() {}

  public static final String SERVICE_NAME = "com.smarter.grpcexample.ExampleService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.smarter.grpc.ExampleGrpc.SimpleMessage,
      com.smarter.grpc.ExampleGrpc.SimpleResponse> METHOD_SIMPLE_RPC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.smarter.grpcexample.ExampleService", "SimpleRPC"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.SimpleMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.SimpleResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.smarter.grpc.ExampleGrpc.SimpleMessage,
      com.smarter.grpc.ExampleGrpc.SimpleResponse> METHOD_SIMPLE_RPCS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "com.smarter.grpcexample.ExampleService", "SimpleRPCs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.SimpleMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.SimpleResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.smarter.grpc.ExampleGrpc.ComplexMessage,
      com.smarter.grpc.ExampleGrpc.ComplexResponse> METHOD_COMPLEX_RPC =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "com.smarter.grpcexample.ExampleService", "ComplexRPC"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.ComplexMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.ComplexResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.smarter.grpc.ExampleGrpc.ComplexMessage,
      com.smarter.grpc.ExampleGrpc.ComplexResponse> METHOD_COMPLEX_RPCS =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING,
          generateFullMethodName(
              "com.smarter.grpcexample.ExampleService", "ComplexRPCs"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.ComplexMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.ComplexResponse.getDefaultInstance()));
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.smarter.grpc.ExampleGrpc.SimpleMessage,
      com.smarter.grpc.ExampleGrpc.SimpleResponse> METHOD_SAY_HI =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING,
          generateFullMethodName(
              "com.smarter.grpcexample.ExampleService", "SayHi"),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.SimpleMessage.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(com.smarter.grpc.ExampleGrpc.SimpleResponse.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExampleServiceStub newStub(io.grpc.Channel channel) {
    return new ExampleServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExampleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExampleServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static ExampleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExampleServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ExampleServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void simpleRPC(com.smarter.grpc.ExampleGrpc.SimpleMessage request,
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_SIMPLE_RPC, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleMessage> simpleRPCs(
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_SIMPLE_RPCS, responseObserver);
    }

    /**
     */
    public void complexRPC(com.smarter.grpc.ExampleGrpc.ComplexMessage request,
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.ComplexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_COMPLEX_RPC, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.ComplexMessage> complexRPCs(
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.ComplexResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_COMPLEX_RPCS, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleMessage> sayHi(
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(METHOD_SAY_HI, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_SIMPLE_RPC,
            asyncUnaryCall(
              new MethodHandlers<
                com.smarter.grpc.ExampleGrpc.SimpleMessage,
                com.smarter.grpc.ExampleGrpc.SimpleResponse>(
                  this, METHODID_SIMPLE_RPC)))
          .addMethod(
            METHOD_SIMPLE_RPCS,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.smarter.grpc.ExampleGrpc.SimpleMessage,
                com.smarter.grpc.ExampleGrpc.SimpleResponse>(
                  this, METHODID_SIMPLE_RPCS)))
          .addMethod(
            METHOD_COMPLEX_RPC,
            asyncUnaryCall(
              new MethodHandlers<
                com.smarter.grpc.ExampleGrpc.ComplexMessage,
                com.smarter.grpc.ExampleGrpc.ComplexResponse>(
                  this, METHODID_COMPLEX_RPC)))
          .addMethod(
            METHOD_COMPLEX_RPCS,
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.smarter.grpc.ExampleGrpc.ComplexMessage,
                com.smarter.grpc.ExampleGrpc.ComplexResponse>(
                  this, METHODID_COMPLEX_RPCS)))
          .addMethod(
            METHOD_SAY_HI,
            asyncClientStreamingCall(
              new MethodHandlers<
                com.smarter.grpc.ExampleGrpc.SimpleMessage,
                com.smarter.grpc.ExampleGrpc.SimpleResponse>(
                  this, METHODID_SAY_HI)))
          .build();
    }
  }

  /**
   */
  public static final class ExampleServiceStub extends io.grpc.stub.AbstractStub<ExampleServiceStub> {
    private ExampleServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExampleServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExampleServiceStub(channel, callOptions);
    }

    /**
     */
    public void simpleRPC(com.smarter.grpc.ExampleGrpc.SimpleMessage request,
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SIMPLE_RPC, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleMessage> simpleRPCs(
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_SIMPLE_RPCS, getCallOptions()), responseObserver);
    }

    /**
     */
    public void complexRPC(com.smarter.grpc.ExampleGrpc.ComplexMessage request,
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.ComplexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_COMPLEX_RPC, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.ComplexMessage> complexRPCs(
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.ComplexResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(METHOD_COMPLEX_RPCS, getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleMessage> sayHi(
        io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleResponse> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(METHOD_SAY_HI, getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ExampleServiceBlockingStub extends io.grpc.stub.AbstractStub<ExampleServiceBlockingStub> {
    private ExampleServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExampleServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExampleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.smarter.grpc.ExampleGrpc.SimpleResponse simpleRPC(com.smarter.grpc.ExampleGrpc.SimpleMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_SIMPLE_RPC, getCallOptions(), request);
    }

    /**
     */
    public com.smarter.grpc.ExampleGrpc.ComplexResponse complexRPC(com.smarter.grpc.ExampleGrpc.ComplexMessage request) {
      return blockingUnaryCall(
          getChannel(), METHOD_COMPLEX_RPC, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExampleServiceFutureStub extends io.grpc.stub.AbstractStub<ExampleServiceFutureStub> {
    private ExampleServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExampleServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExampleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smarter.grpc.ExampleGrpc.SimpleResponse> simpleRPC(
        com.smarter.grpc.ExampleGrpc.SimpleMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SIMPLE_RPC, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.smarter.grpc.ExampleGrpc.ComplexResponse> complexRPC(
        com.smarter.grpc.ExampleGrpc.ComplexMessage request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_COMPLEX_RPC, getCallOptions()), request);
    }
  }

  private static final int METHODID_SIMPLE_RPC = 0;
  private static final int METHODID_COMPLEX_RPC = 1;
  private static final int METHODID_SIMPLE_RPCS = 2;
  private static final int METHODID_COMPLEX_RPCS = 3;
  private static final int METHODID_SAY_HI = 4;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExampleServiceImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(ExampleServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMPLE_RPC:
          serviceImpl.simpleRPC((com.smarter.grpc.ExampleGrpc.SimpleMessage) request,
              (io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleResponse>) responseObserver);
          break;
        case METHODID_COMPLEX_RPC:
          serviceImpl.complexRPC((com.smarter.grpc.ExampleGrpc.ComplexMessage) request,
              (io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.ComplexResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SIMPLE_RPCS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.simpleRPCs(
              (io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleResponse>) responseObserver);
        case METHODID_COMPLEX_RPCS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.complexRPCs(
              (io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.ComplexResponse>) responseObserver);
        case METHODID_SAY_HI:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sayHi(
              (io.grpc.stub.StreamObserver<com.smarter.grpc.ExampleGrpc.SimpleResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_SIMPLE_RPC,
        METHOD_SIMPLE_RPCS,
        METHOD_COMPLEX_RPC,
        METHOD_COMPLEX_RPCS,
        METHOD_SAY_HI);
  }

}
