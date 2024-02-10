package org.example.ThreadingBasics;

public class SimpleThread1 implements Runnable{

    public void doSomeStaff(){
        System.out.println(Thread.currentThread());
    }

    @Override
    public void run() {
        doSomeStaff();
    }
}
