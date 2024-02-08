package org.example.Threading.ThreadSync;

public class SimpleThreadWithSync implements Runnable{

    int num;
    public SimpleThreadWithSync(int num) {
        this.num = num;
    }

    /*
    * //this is syncronized block also possible
    * synchronized (this){
    * if(num>0{
    * num--;
    * }
    * }
    * */

    public synchronized void decrement(Thread ct){
        if(num>0){
            System.out.println("Thread: "+ ct.getName() + "num: "+num +" num decremented");

            //Common memory not saved (problem -> race condition)
            num--;
        }
        else{
            System.out.println("Thread: "+ ct.getName() + " not decremented");
        }

        //do something
        double n;
        for(int i=0; i<100;i++){
            n =Math.random();
        }
    }

    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        decrement(ct);
    }
}
