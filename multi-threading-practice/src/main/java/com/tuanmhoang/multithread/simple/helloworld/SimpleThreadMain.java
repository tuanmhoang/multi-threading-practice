package com.tuanmhoang.multithread.simple.helloworld;

public class SimpleThreadMain {
    public static void main(String[] args) {
        // run 1 time
        Runnable simpleThread = new SimpleThread();
        Thread simple = new Thread(simpleThread);
        simple.start();

        System.out.println("----------------------------");

        // run 10 times
        Runnable simpleThreadWithResources = new SimpleThreadWithResources(10);
        Thread simpleWithResources = new Thread(simpleThreadWithResources);
        simpleWithResources.start();
    }
}
