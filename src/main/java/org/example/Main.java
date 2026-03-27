package org.example;

public class Main {

    public static void main(String [] args) {
        TimeProvider timeProvider = new RealTimeProvider();
        Welcome welcome = new Welcome(timeProvider);
        String message = welcome.getMessage();
        System.out.println(message);

    }
}
