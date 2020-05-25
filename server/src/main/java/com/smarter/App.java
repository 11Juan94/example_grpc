package com.smarter;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.smarter.implementations.ExampleServerImpl;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class App {
    private static Logger logger = Logger.getLogger(App.class.getName());
    public static void main(String[] args) {
        try {
            logger.log(Level.INFO, "Server starting...");
            Server server = ServerBuilder.forPort(50050).addService(new ExampleServerImpl()).build();
            server.start();
            logger.log(Level.INFO, "Server running");
            server.awaitTermination();
		    logger.log(Level.INFO, "Server stop");
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Can't start server", e);
        }
    }
    
}