package org.example.Threading.ThreadGroup;

public class SimpleThread implements Runnable{

    @Override
    public void run(){
        System.out.println("Current thread: " + Thread.currentThread());
    }
}
