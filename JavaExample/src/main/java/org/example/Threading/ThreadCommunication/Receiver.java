package org.example.Threading.ThreadCommunication;

public class Receiver implements Runnable{
    private final Message message;

    public Receiver(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        System.out.println("Receiver started.");

        while(true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            String content = message.getContent();
            System.out.println("Received: "+ content);
            if(content.equals("Bye")){
                break;
            }
        }

    }
}
