package com.tuanmhoang.multithread.map.fixed.syncmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FixedSynchronizedMapMultiMain {
    public static void main(String[] args) {
        Map<Integer, Integer> input = new HashMap<>();
        input.put(0, 1);
        input.put(1, 200);
        MapHandler handler = new MapHandler(Collections.synchronizedMap(input));

        Runnable mapReadMultiThreading = new MapReadMultiThreading(handler);
        Thread readThread = new Thread(mapReadMultiThreading);
        readThread.start();

        Runnable mapWriteMultiThreading = new MapWriteMultiThreading(handler);
        Thread writeThread = new Thread(mapWriteMultiThreading);
        writeThread.start();
    }
}
