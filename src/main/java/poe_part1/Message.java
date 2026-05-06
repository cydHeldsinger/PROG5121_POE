package poe_part1;

import javax.swing.JOptionPane;

public class Message {
    // These are the "fields" described in image_21.png
    private String messageID;
    private String recipientNumber;
    private String messageContent;
    private int messageCount = 0;

    // Method 1: Check Message ID length (image_24.png)
    public boolean checkMessageID(String id) {
        return id.length() <= 10;
    }

    // Method 2: Check Recipient Cell Number (image_24.png)
    public String checkRecipientCell(String cell) {
        // Requirement: starts with '+' and no more than 10 characters long
        if (cell.startsWith("+") && cell.length() <= 10) {
            this.recipientNumber = cell;
            return "Cell phone number successfully captured.";
        } else {
            return "Cell phone number is incorrectly formatted or does not contain an international code. Please correct the number and try again.";
        }
        }
        
        // Method 3: Create Message Hash (image_24.pdf)
public String createMessageHash(String id, String msg, int num) {
    // 1. Get the first two numbers of the message ID
    String firstTwoId = id.substring(0, 2);

    // 2. Split the message to find the first and last words
    String[] words = msg.trim().split("\\s+");
    String firstWord = words[0];
    String lastWord = words[words.length - 1];

    // 3. Combine them into the format: ID:Num:FIRSTLAST
    String hash = firstTwoId + ":" + num + ":" + firstWord + lastWord;

    // 4. Return in all caps as per image_21.png
    return hash.toUpperCase();
}

// Method 5: Check Message Length (image_24.png)
public boolean checkMessageLength(String msg) {
    // Requirement: ensure message is no more than 250 characters
    return msg.length() <= 250;
}
// Method 4: Return Message Status (image_24.png)
public String sentMessage(int choice) {
    // Based on the requirements in image_27.png
    if (choice == 1) {
        return "Message successfully sent";
    } else if (choice == 2) {
        return "Press 0 to delete the message";
    } else if (choice == 3) {
        return "Message successfully stored";
    } else {
        return "Invalid selection";
    }
    }
    public String captureMessageData(String id, String recipient, String content) {
    this.messageID = id;
    this.recipientNumber = recipient;
    this.messageContent = content;

    if (checkMessageLength(content)) {
        return "Message successfully captured";
    } else {
        return "Message is too long, please try again";
    }
}
}
    

