package com.tuanmhoang.multithread.map.problem;

import java.util.Map;
import java.util.Random;

public class MapHandler {

    private Map<Integer, Integer> map;

    public MapHandler(Map<Integer, Integer> map) {
        this.map = map;
    }

    public void read() throws InterruptedException {
        while (true) {
            Thread.sleep(500);
            map.forEach((k, v) -> System.out.println(k + " ::: " + v));
        }
    }

    public void write() {
        Random r = new Random();
        while (true) {
            map.put(map.size() + 1, r.nextInt(100));
        }
    }
}
