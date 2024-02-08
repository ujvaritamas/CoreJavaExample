package org.example.Threading;

public class ThreadExample0 extends Thread{

    @Override
    public void run(){
        System.out.println("This is running in tread " + Thread.currentThread().threadId());
    }
}
