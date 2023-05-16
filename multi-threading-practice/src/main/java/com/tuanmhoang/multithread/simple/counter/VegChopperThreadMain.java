package com.tuanmhoang.multithread.simple.counter;

public class VegChopperThreadMain {
    public static void main(String[] args) throws InterruptedException {
        VegChopperThread alice = new VegChopperThread("Alice");
        VegChopperThread bob = new VegChopperThread("Bob");

        alice.start();
        bob.start();
        Thread.sleep(1000);
        VegChopperThread.chopping = false;

        alice.join();
        bob.join();

        System.out.println("Alice chopped: " + alice.vegetableCount);
        System.out.println("Bob chopped: " + bob.vegetableCount);
    }
}
