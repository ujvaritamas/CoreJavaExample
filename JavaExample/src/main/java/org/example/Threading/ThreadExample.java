package org.example.Threading;

import org.example.Threading.SingleThread;
import org.example.Threading.ThreadCreator;

public class ThreadExample {

    public void executeSingleThread(){
        SingleThread singleThread = new SingleThread();

        long startTime = System.currentTimeMillis();
        singleThread.execute();
        long stopTime = System.currentTimeMillis();
        System.out.println("Single thread execution time: " + (stopTime - startTime) + "us");
    }

    public void executeMultiThread0(){
        System.out.println("Example multithread0");

        ThreadCreator threadCreator = new ThreadCreator();
        threadCreator.createMultiThreadExample0();
    }

    public void executeMultiThread1(){
        System.out.println("Example multithread1");

        ThreadCreator threadCreator = new ThreadCreator();
        threadCreator.createMultiThreadExample1();
    }
}
