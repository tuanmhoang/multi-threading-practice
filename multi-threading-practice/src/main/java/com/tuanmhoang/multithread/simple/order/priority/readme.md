Before applying priority

```
> Task :PrinterThreadPriorityMain.main()
[Printer 2] - Page ... 1
[Printer 1] - Page ... 1
[Printer 2] - Page ... 2
[Printer 1] - Page ... 2
[Printer 2] - Page ... 3
[Printer 1] - Page ... 3
[Printer 2] - Page ... 4
[Printer 1] - Page ... 4
[Printer 2] - Page ... 5
[Printer 1] - Page ... 5
[Printer 2] - Page ... 6
[Printer 1] - Page ... 6
[Printer 2] - Page ... 7
[Printer 1] - Page ... 7
[Printer 1] - Page ... 8
[Printer 2] - Page ... 8
[Printer 1] - Page ... 9
[Printer 2] - Page ... 9
[Printer 1] - Page ... 10
[Printer 2] - Page ... 10
```

After using `setPriority()`

```
> Task :PrinterThreadPriorityMain.main()
[Printer 1] - Page ... 1
[Printer 1] - Page ... 2
[Printer 1] - Page ... 3
[Printer 1] - Page ... 4
[Printer 1] - Page ... 5
[Printer 1] - Page ... 6
[Printer 1] - Page ... 7
[Printer 1] - Page ... 8
[Printer 1] - Page ... 9
[Printer 1] - Page ... 10
[Printer 2] - Page ... 1
[Printer 2] - Page ... 2
[Printer 2] - Page ... 3
[Printer 2] - Page ... 4
[Printer 2] - Page ... 5
[Printer 2] - Page ... 6
[Printer 2] - Page ... 7
[Printer 2] - Page ... 8
[Printer 2] - Page ... 9
[Printer 2] - Page ... 10
```