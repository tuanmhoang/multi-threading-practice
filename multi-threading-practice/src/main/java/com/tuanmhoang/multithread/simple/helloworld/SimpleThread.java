package com.tuanmhoang.multithread.simple.helloworld;

public class SimpleThread implements Runnable{
    @Override
    public void run() {
        System.out.println("hello world");
    }
}
