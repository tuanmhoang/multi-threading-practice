package com.tuanmhoang.multithread.map.problem;

import java.util.HashMap;
import java.util.Map;

public class MapMultiMain {
    public static void main(String[] args) {
        Map<Integer, Integer> input = new HashMap<>();
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
