package org.example.ThreadingBasics;

//compiled with compiler in terminal
public class SimpleThread0 extends Thread{

    public void doSomeTask(){
        System.out.println(Thread.currentThread());
    }

    @Override
    public void run(){
        doSomeTask();
    }

}