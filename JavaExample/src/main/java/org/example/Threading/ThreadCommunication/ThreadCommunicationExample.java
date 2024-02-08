package org.example.Threading.ThreadCommunication;

public class ThreadCommunicationExample {
    public void execute(){
        Message message = new Message();

        Thread sender = new Thread(new Sender(message));
        sender.setName("senderthread");
        Thread receiver = new Thread(new Receiver(message));
        receiver.setName("receiverthread");
        sender.start();
        receiver.start();

        try {
            sender.join();
            receiver.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
