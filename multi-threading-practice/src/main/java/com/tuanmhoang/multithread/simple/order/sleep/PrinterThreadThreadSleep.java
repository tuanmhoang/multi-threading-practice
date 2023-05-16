package com.tuanmhoang.multithread.simple.order.sleep;

import com.tuanmhoang.multithread.simple.order.Printer;

public class PrinterThreadThreadSleep implements Runnable {

    private Printer printer;

    private String name;

    public PrinterThreadThreadSleep(final String name, final Printer printer) {
        this.name = name;
        this.printer = printer;
    }

    @Override
    public void run() {
        for (int i = 0; i < printer.getLimit(); i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("[" + name + "] - Page ... " + (i + 1));
        }
    }
}
