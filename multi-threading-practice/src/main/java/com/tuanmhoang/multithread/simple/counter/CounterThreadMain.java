package com.tuanmhoang.multithread.simple.counter;

public class CounterThreadMain {
    public static void main(String[] args) throws InterruptedException {
        CounterThread firstCounter = new CounterThread("firstCounter");
        CounterThread secondCounter = new CounterThread("secondCounter");

        Thread first = new Thread(firstCounter);
        Thread second = new Thread(secondCounter);

        first.start();
        second.start();

        Thread.sleep(1000);

        firstCounter.setKeepCounting(false);
        secondCounter.setKeepCounting(false);

        first.join();
        second.join();

        System.out.println("first counter: " + firstCounter.getCounter());
        System.out.println("second counter: " + secondCounter.getCounter());
    }
}
