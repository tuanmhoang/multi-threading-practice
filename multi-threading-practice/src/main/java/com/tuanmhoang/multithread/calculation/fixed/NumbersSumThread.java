package com.tuanmhoang.multithread.calculation.fixed;

public class NumbersSumThread implements Runnable {
    private NumbersHandler numbersHandler;

    public NumbersSumThread(NumbersHandler numbersHandler) {
        this.numbersHandler = numbersHandler;
    }

    @Override
    public void run() {
        try {
                numbersHandler.sumNumbers();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
