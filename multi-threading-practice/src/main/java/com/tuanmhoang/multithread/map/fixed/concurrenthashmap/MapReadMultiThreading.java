package com.tuanmhoang.multithread.map.fixed.concurrenthashmap;

public class MapReadMultiThreading implements Runnable {

    private MapHandler mapHandler;

    public MapReadMultiThreading(MapHandler mapHandler) {
        this.mapHandler = mapHandler;
    }

    @Override
    public void run() {
        System.out.println("... Reading ...");
        try {
            mapHandler.read();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
