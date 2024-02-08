package org.example.Threading;

public class SingleThread {

    public void execute(){
        int d = 0;
        for(int i = 0; i<1000; i++){
            d++;
        }
        System.out.println("hello single thread" + d);
    }
}
