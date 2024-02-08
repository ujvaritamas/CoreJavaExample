package org.example.Threading.ThreadCommunication;

import java.io.PrintStream;

public class Sender implements Runnable{

    Message message;

    public Sender(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println("Sender started.");

        String[] messages = {"hello", "How are you", "Bye"};

        for(String s: messages){
            message.setContent(s);
            System.out.println("Sent: "+ s);
            //try{
            //    System.out.println("Sleep");
            //    Thread.sleep(1);
            //} catch (InterruptedException e) {

            //}
        }
        System.out.println("Sender finished.");
    }
}
