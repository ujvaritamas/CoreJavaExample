package org.example.Threading.MultiThread;

public class SimpleThread implements Runnable{

    int n;
    SimpleThread (int n)
    {
        this.n = n;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread ();
        System.out.println (t.getName () + "Thread started...");
        for (int i = 0; i < n; i++)
        {
            System.out.println (t.getName () + "Thread value:" + i);
            try
            {
                Thread.sleep (1000);
            }
            catch (InterruptedException ie)
            {
            }
        }
        System.out.println (t.getName () + "Thread is Terminated...");
    }
}
