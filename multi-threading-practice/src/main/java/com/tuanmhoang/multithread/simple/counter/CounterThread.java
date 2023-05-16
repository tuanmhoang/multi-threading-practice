package com.tuanmhoang.multithread.simple.counter;

public class CounterThread implements Runnable{

    private int counter = 0;
    private volatile boolean keepCounting = true;

    private String name;

    public CounterThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        while (keepCounting){
            System.out.println(this.getName()+ " is counting... " + counter);
            counter ++;
        }
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public boolean isKeepCounting() {
        return keepCounting;
    }

    public void setKeepCounting(boolean keepCounting) {
        this.keepCounting = keepCounting;
    }
}
