package com.tuanmhoang.multithread.calculation.deadlock;

public class NumbersWriterThread implements Runnable {

    private NumbersHandler numbersHandler;

    public NumbersWriterThread(NumbersHandler numbersHandler) {
        this.numbersHandler = numbersHandler;
    }

    @Override
    public void run() {
        try {
            numbersHandler.writeNumber();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
