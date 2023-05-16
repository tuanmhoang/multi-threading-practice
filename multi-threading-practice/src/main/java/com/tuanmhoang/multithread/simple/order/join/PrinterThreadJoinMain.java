package com.tuanmhoang.multithread.simple.order.join;

import com.tuanmhoang.multithread.simple.order.Printer;

public class PrinterThreadJoinMain {
    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer(10);
        Runnable r1 = new PrinterThreadJoin("Printer 1", printer);
        Runnable r2 = new PrinterThreadJoin("Printer 2", printer);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
    }

}
