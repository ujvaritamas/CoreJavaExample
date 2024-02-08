package org.example.Threading;

public class ThreadCreator {

    public void createMultiThreadExample0(){

        for(int i= 0; i<10; i++){
            ThreadExample0 object = new ThreadExample0();
            object.start();
        }
    }

    public void createMultiThreadExample1(){
        for(int i= 0; i<10; i++){
            Thread object = new Thread(new ThreadExample1());
            object.start();
        }
    }
}
