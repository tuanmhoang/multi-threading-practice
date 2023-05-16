package com.tuanmhoang.multithread.simple.order.sync;

import com.tuanmhoang.multithread.simple.order.Printer;

public class PrinterOrderSynchronizedMain {

    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer(10);
        Runnable thread1 = new PrinterThreadSynchronized("Printer 1",printer);
        Runnable thread2 = new PrinterThreadSynchronized("Printer 2",printer);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();
    }
}
