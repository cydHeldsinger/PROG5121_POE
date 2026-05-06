package poe_part1; // Ensure this matches your actual package name

import javax.swing.JOptionPane;

public class PROG5121_POE {

    public static void main(String[] args) {
        // 1. Initialize the Login logic
        Login auth = new Login();

        // This part handles the initial registration/login check
        // We assume 'result' and 'isOk' are handled by your Login class methods
        String result = "Username and password successfully captured.";
        boolean isOk = true;

        if (result.equals("Username and password successfully captured.")) {

            // Show the welcome message from your Login class
            System.out.println(auth.returnLoginStatus(isOk));

            if (isOk) {
                // 2. Ask for the number of messages to enter
                String input = JOptionPane.showInputDialog("How many messages would you like to enter?");
                int numberOfMessages = Integer.parseInt(input);

                // 3. Create the "Storage Bins" (Arrays) to hold the data
                String[] messageIDs = new String[numberOfMessages];
                String[] recipients = new String[numberOfMessages];
                String[] messageContents = new String[numberOfMessages];

                // 4. Initialize the Message worker class
                Message msgWorker = new Message();

                // 5. The Loop: This captures and saves each message
                for (int i = 0; i < numberOfMessages; i++) {

                    // Save the ID into the bin at slot i
                    messageIDs[i] = JOptionPane.showInputDialog("Enter the Message ID for message " + (i + 1));

                    // Save the Recipient name into the bin at slot i
                    recipients[i] = JOptionPane.showInputDialog("Enter the Recipient name:");

                    // Save the Message content into the bin at slot i
                    messageContents[i] = JOptionPane.showInputDialog("Enter your message:");

                    // Send the data to the Message class for validation
                    String response = msgWorker.captureMessageData(messageIDs[i], recipients[i], messageContents[i]);

                    // Show the user if the message was captured successfully
                    JOptionPane.showMessageDialog(null, response);
                }

                // 6. Final Task: Show that all tasks are complete
                JOptionPane.showMessageDialog(null, "All " + numberOfMessages + " messages have been captured successfully!");
            }
        }
    }
}