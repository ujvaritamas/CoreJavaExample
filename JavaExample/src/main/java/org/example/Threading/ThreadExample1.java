package org.example.Threading;

public class ThreadExample1 implements Runnable{
    @Override
    public void run() {
        System.out.println("This is running in tread " + Thread.currentThread().threadId());
    }
}
