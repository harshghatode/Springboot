package com.example.demo;

import java.io.IOException;
import java.net.Socket;

public class TomcatChecker {

    public boolean isTomcatRunning() {
        try (Socket socket = new Socket("localhost", 8080)) {
            return true; // Tomcat is running
        } catch (IOException e) {
            return false; // Tomcat is NOT running
        }
    }
}