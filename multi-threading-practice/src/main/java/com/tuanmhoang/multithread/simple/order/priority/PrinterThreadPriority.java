package com.tuanmhoang.multithread.simple.order.priority;

import com.tuanmhoang.multithread.simple.order.Printer;

public class PrinterThreadPriority implements Runnable{
    
    private String name;
    
    private Printer printer;

    public PrinterThreadPriority(String name, Printer printer) {
        this.name = name;
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < printer.getLimit(); i++) {
            System.out.println("[" + name + "] - Page ... " + (i + 1));
        }
    }
}
