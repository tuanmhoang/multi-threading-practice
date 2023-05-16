### Problem

To create `ConcurrentModificationException`:

- create `MapHandler`

```
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
```

- create `MapReadMultiThreading`

```
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

```

- create `MapWriteMultiThreading`

```
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
```

- create main class to trigger

```
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
```

- expected result

```
Exception in thread "Thread-0" java.util.ConcurrentModificationException
	at java.base/java.util.HashMap.forEach(HashMap.java:1424)
	at com.tuanmhoang.multithread.map.fixed.MapHandler.read(MapHandler.java:17)
	at com.tuanmhoang.multithread.map.fixed.MapReadMultiThreading.run(MapReadMultiThreading.java:15)
	at java.base/java.lang.Thread.run(Thread.java:833)
```

---

### Solution

To fix the problem

- use `ConcurrentHashMap`

```
public class MapMultiMain {
    public static void main(String[] args) {
        Map<Integer, Integer> input = new ConcurrentHashMap<>();
        ....
    }
}
```
- use `Collections.synchronizedMap`

```
public class FixedSynchronizedMapMultiMain {
    public static void main(String[] args) {
        ...
        MapHandler handler = new MapHandler(Collections.synchronizedMap(input));
        ...
    }
}
```

In `write()` method, use `synchronized (map)`

```
    public void write() {
        Random r = new Random();
        while (true) {
            synchronized (map) {
                map.put(map.size() + 1, r.nextInt(100));
            }
        }
    }
```