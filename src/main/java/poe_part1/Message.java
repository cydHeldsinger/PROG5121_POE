package poe_part1;

import javax.swing.JOptionPane;

public class Message {

    
    private String messageID;
    private String recipient;
    private String messageContent;

    
    public boolean checkMessageLength(String msg) {
        return msg.length() <= 250;
    }

   
    public String captureMessageData(String id, String person, String content) {
        this.messageID = id;
        this.recipient = person;
        this.messageContent = content;

        if (checkMessageLength(content)) {
            return "Message successfully captured";
        } else {
            return "Message is too long, please try again";
        }
    }

   
    public String returnMessageReport() {
        return "Message ID: " + messageID + "\n" +
               "Recipient: " + recipient + "\n" +
               "Message: " + messageContent;
    }
}