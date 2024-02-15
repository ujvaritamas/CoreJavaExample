package org.example.ThreadingBasics;

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        SimpleThread0 t0 = new SimpleThread0();
        SimpleThread0 t1 = new SimpleThread0();
        t0.start();
        t1.start();

        System.out.println("Main finished");

        Thread t3 = new Thread(new SimpleThread1());
        Thread t4 = new Thread(new SimpleThread1());

        t3.start();
        t4.start();

        //Do it with lambda with this runable implements not needed
        SimpleThread1 t5 = new SimpleThread1();
        new Thread(() -> {
            t5.doSomeStaff();
        }).start();

        new Thread(t5::doSomeStaff).start();

    }
}
