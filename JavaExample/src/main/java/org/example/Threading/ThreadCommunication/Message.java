package org.example.Threading.ThreadCommunication;

public class Message {
    private String content;
    private boolean isMessageReady = false;

    public synchronized void setContent(String content){
        while(isMessageReady){
            try{
                System.out.println("Thread wait() "+Thread.currentThread());
                wait();
            }
            catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        this.content = content;
        this.isMessageReady = true;
        notify();
    }

    public synchronized String getContent(){
        while(!isMessageReady) {
            try {
                System.out.println("Thread wait() "+Thread.currentThread());
                wait(); //wait until there is new content
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String msg =  content;
        isMessageReady = false;
        notify();
        return msg;
    }

}
