package com.tuanmhoang.multithread.simple.order.priority;

import com.tuanmhoang.multithread.simple.order.Printer;

public class PrinterThreadPriorityMain {

    public static void main(String[] args) {
        Printer printer = new Printer(10);

        Runnable r1 = new PrinterThreadPriority("Printer 1", printer);
        Runnable r2 = new PrinterThreadPriority("Printer 2", printer);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }
}
