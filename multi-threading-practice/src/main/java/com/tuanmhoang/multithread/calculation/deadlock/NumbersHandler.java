package com.tuanmhoang.multithread.calculation.deadlock;

import java.util.List;
import java.util.Random;

public class NumbersHandler {
    private List<Integer> inputs;

    private Random random = new Random();

    public NumbersHandler(List<Integer> inputs) {
        this.inputs = inputs;
    }

    public void writeNumber() throws InterruptedException {
        int randomNumber = 0;
        while (true) {
            Thread.sleep(100);

            randomNumber = random.nextInt(100);
            inputs.add(randomNumber);
            System.out.println("[1] adding to list: " + randomNumber + " - list size is now: " + inputs.size());
        }
    }

    public void sumNumbers() throws InterruptedException {
        while (true) {
            Thread.sleep(200);
            int sum = inputs.stream()
                .reduce(0, (a, b) -> a + b);
            System.out.println("[2] calculated sum: " + sum + " - list size is now: " + inputs.size());
        }
    }

    public void squareRootSumOfSquares() throws InterruptedException {
        while (true) {
            Thread.sleep(200);
            int sumSquares = inputs.stream()
                .reduce(0, (a, b) -> a + b);
            var squareRootSumOfSquares = Math.sqrt(sumSquares);
            System.out.println("[3] calculated sumSquares: " + sumSquares + " - squareRootSumOfSquares: " + squareRootSumOfSquares
                + " - list size is now: " + inputs.size());
        }
    }
}
