private int count = 0;

private final Integer Lock = count; // Boxed primitive Lock is shared
private final Integer Lock = new Integer(count);

 
public void doSomething() {
  synchronized (Lock) {
    count++;
    // ...
  }
}
