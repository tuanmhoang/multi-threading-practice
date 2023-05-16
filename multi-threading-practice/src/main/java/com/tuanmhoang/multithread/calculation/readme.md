Create three threads:

- 1st thread is infinitely writing random number to the collection; 
- 2nd thread is printing sum of the numbers in the collection; 
- 3rd is printing square root of sum of squares of all numbers in the collection.

Make these calculations thread-safe using synchronization block. Fix the possible deadlock.

To demo deadlock case, check `deadlock` package.

Sample output

```
...
[1] adding to list: 31 - list size is now: 28
Exception in thread "Thread-1" Exception in thread "Thread-2" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1631)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.reduce(ReferencePipeline.java:657)
	at com.tuanmhoang.multithread.calculation.NumbersHandler.sumNumbers(NumbersHandler.java:30)
	at com.tuanmhoang.multithread.calculation.NumbersSumThread.run(NumbersSumThread.java:13)
	at java.base/java.lang.Thread.run(Thread.java:833)
java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1631)
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
	at java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)
	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
	at java.base/java.util.stream.ReferencePipeline.reduce(ReferencePipeline.java:657)
	at com.tuanmhoang.multithread.calculation.NumbersHandler.squareRootSumOfSquares(NumbersHandler.java:39)
	at com.tuanmhoang.multithread.calculation.NumbersSquareRootThread.run(NumbersSquareRootThread.java:13)
	at java.base/java.lang.Thread.run(Thread.java:833)
[1] adding to list: 25 - list size is now: 29
...
```

To fix, refer to `fixed` package

This problem can be fixed by adding `synchronized (inputs)` to synchronize the shared resources, in this case is `inputs`
