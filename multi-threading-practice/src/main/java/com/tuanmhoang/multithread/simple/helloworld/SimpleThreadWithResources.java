package com.tuanmhoang.multithread.simple.helloworld;

public class SimpleThreadWithResources implements Runnable {

    private int limit;

    public SimpleThreadWithResources(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 0; i < limit; i++) {
            System.out.println("Printing ... " + i);
        }
    }

}
