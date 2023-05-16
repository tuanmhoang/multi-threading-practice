package com.tuanmhoang.multithread.map.fixed.concurrenthashmap;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FixedConcurrentHashMapMultiMain {
    public static void main(String[] args) {
        Map<Integer, Integer> input = new ConcurrentHashMap<>();
        input.put(0, 1);
        input.put(1, 200);

        MapHandler handler = new MapHandler(input);

        Runnable mapReadMultiThreading = new MapReadMultiThreading(handler);
        Thread readThread = new Thread(mapReadMultiThreading);
        readThread.start();

        Runnable mapWriteMultiThreading = new MapWriteMultiThreading(handler);
        Thread writeThread = new Thread(mapWriteMultiThreading);
        writeThread.start();
    }
}
