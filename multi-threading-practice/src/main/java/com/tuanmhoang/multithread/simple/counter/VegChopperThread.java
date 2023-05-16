package com.tuanmhoang.multithread.simple.counter;

public class VegChopperThread extends Thread{
    public int vegetableCount = 0;
    public static boolean chopping = true;

    public VegChopperThread(String name){
        this.setName(name);
    }

    public void run(){
        while (chopping){
            System.out.println(this.getName()+" chopping...");
            vegetableCount++;
        }
    }
}
