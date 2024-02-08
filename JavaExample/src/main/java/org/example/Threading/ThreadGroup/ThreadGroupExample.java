package org.example.Threading.ThreadGroup;

public class ThreadGroupExample {

    public void executeWithThreadGroup(){
        ThreadGroup tg = new ThreadGroup ("UDTG");

        SimpleThread mt = new SimpleThread ();
        Thread t1 = new Thread (mt);
        Thread t2 = new Thread (tg, mt);
        Thread t3 = new Thread (mt);
        Thread t4 = new Thread (tg, mt);
        t1.start ();
        t2.start ();
        t3.start ();
        t4.start ();
        Thread ct = Thread.currentThread ();
        System.out.println ("Current thread : "+ct);

    }

}
