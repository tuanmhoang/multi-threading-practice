package com.tuanmhoang.multithread.simple.order.sync;

import com.tuanmhoang.multithread.simple.order.Printer;

public class PrinterThreadSynchronized implements Runnable {

    private Printer printer;

    private String name;

    public PrinterThreadSynchronized(final String name, final Printer printer) {
        this.name = name;
        this.printer = printer;
    }

    @Override
    public void run() {
        synchronized (printer) {
            for (int i = 0; i < printer.getLimit(); i++) {
                System.out.println("[" + name + "] - Page ... " + (i + 1));
            }
        }
    }
}
