package org.example.Threading.MultiThread;

public class ThreadJoin {
    public void exampleJoin(){
        System.out.println ("Main Thread started...");
        SimpleThread mt1 = new SimpleThread (10);
        SimpleThread mt2 = new SimpleThread (15);
        Thread t1 = new Thread (mt1, "child1");
        Thread t2 = new Thread (mt2, "child2");
        t1.start ();
        t2.start ();
        for (int i = 1; i <= 5; i++)
        {
            System.out.println ("Main Thread Value:" + i);
            try
            {
                Thread.sleep (1000);
            }
            catch (InterruptedException ie)
            {
            }
        }

        System.out.println (t1.isAlive ()); //true
        System.out.println (t2.isAlive ()); //true
        try
        {
            //parent thread will wait the child threads
            t1.join ();
            t2.join ();
        }
        catch (InterruptedException ie)
        {
        }
        System.out.println (t1.isAlive ()); //false
        System.out.println (t2.isAlive ()); //false
        System.out.println ("Main thread is terminated...");



    }
}
