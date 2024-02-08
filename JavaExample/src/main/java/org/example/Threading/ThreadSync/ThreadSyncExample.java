package org.example.Threading.ThreadSync;

public class ThreadSyncExample {

    public void executeNoSync(){
        SimpleThreadNoSync simpleThreadNoSync = new SimpleThreadNoSync(1);

        Thread t0 = new Thread(simpleThreadNoSync);
        Thread t1 = new Thread(simpleThreadNoSync);
        Thread t2 = new Thread(simpleThreadNoSync);

        t0.start();
        t1.start();
        t2.start();

        try{
            t0.join();
            t1.join();
            t2.join();
        }
        catch (InterruptedException ie){
            System.out.println("interrupted");
        }

        System.out.println("Main thread: "+ Thread.currentThread());
    }

    public void executeSync() {
        SimpleThreadWithSync simpleThreadWithSync = new SimpleThreadWithSync(1);

        Thread t0 = new Thread(simpleThreadWithSync);
        Thread t1 = new Thread(simpleThreadWithSync);
        Thread t2 = new Thread(simpleThreadWithSync);

        t0.start();
        t1.start();
        t2.start();

        try{
            t0.join();
            t1.join();
            t2.join();
        }
        catch (InterruptedException ie){
            System.out.println("interrupted");
        }


        System.out.println("Main thread: "+ Thread.currentThread());


    }
}
