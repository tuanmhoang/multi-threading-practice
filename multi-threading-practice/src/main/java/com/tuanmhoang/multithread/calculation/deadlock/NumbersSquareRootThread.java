package com.tuanmhoang.multithread.calculation.deadlock;

public class NumbersSquareRootThread implements Runnable{
    private NumbersHandler numbersHandler;

    public NumbersSquareRootThread(NumbersHandler numbersHandler) {
        this.numbersHandler = numbersHandler;
    }

    @Override
    public void run() {
        try {
            numbersHandler.squareRootSumOfSquares();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
