Scenario:

- 2 printer threads
- print in order, for example: `Printer 1`, then `Printer 2`

Some solutions:
- use `join`
- use `synchronized`
- use `setPriority`
- use `sleep`: this one in my opinion can run, but it is not recommended because it is not the right way to do. 