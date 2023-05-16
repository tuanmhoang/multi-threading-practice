package com.tuanmhoang.multithread.calculation.deadlock;

import java.util.ArrayList;
import java.util.List;

public class CollectionCalculatorMain {

    public static void main(String[] args) throws InterruptedException {

        List<Integer> inputs = new ArrayList<>();
        NumbersHandler numbersHandler = new NumbersHandler(inputs);

        Runnable r1 = new NumbersWriterThread(numbersHandler);
        Thread t1 = new Thread(r1);

        Runnable r2 = new NumbersSumThread(numbersHandler);
        Thread t2 = new Thread(r2);

        Runnable r3 = new NumbersSquareRootThread(numbersHandler);
        Thread t3 = new Thread(r3);

        t1.start();
        //t1.join();
        t2.start();
        t3.start();
    }
}
