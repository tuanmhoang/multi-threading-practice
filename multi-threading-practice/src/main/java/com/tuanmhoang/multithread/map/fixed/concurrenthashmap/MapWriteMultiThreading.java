package com.tuanmhoang.multithread.map.fixed.concurrenthashmap;

public class MapWriteMultiThreading implements Runnable {

    private MapHandler mapHandler;

    public MapWriteMultiThreading(MapHandler mapHandler) {
        this.mapHandler = mapHandler;
    }

    @Override
    public void run() {
        System.out.println("... Writing ...");
        mapHandler.write();
    }
}
