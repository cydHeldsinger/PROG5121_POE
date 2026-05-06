package poe_part1;

import javax.swing.JOptionPane;

public class PROG5121_POE {

    public static void main(String[] args) {
        Login auth = new Login();

        // --- REGISTRATION PHASE ---
        JOptionPane.showMessageDialog(null, "Welcome to Registration");
        String fName = JOptionPane.showInputDialog("Enter First Name:");
        String lName = JOptionPane.showInputDialog("Enter Last Name:");
        String user = JOptionPane.showInputDialog("Create Username (5 chars max, must have _):");
        String pass = JOptionPane.showInputDialog("Create Password (8 chars, Upper, Number, Special):");

        // Register the user and get the result message
        String regStatus = auth.registerUser(fName, lName, user, pass);
        JOptionPane.showMessageDialog(null, regStatus);

        // Only continue if registration was successful
        if (regStatus.equals("Username and password successfully captured.")) {

            // --- LOGIN PHASE ---
            String loginUser = JOptionPane.showInputDialog("Enter Username to Login:");
            String loginPass = JOptionPane.showInputDialog("Enter Password to Login:");

            boolean isOk = auth.loginUser(loginUser, loginPass);
            JOptionPane.showMessageDialog(null, auth.returnLoginStatus(isOk));

            // --- MESSAGE PHASE (Only if login is successful) ---
            if (isOk) {
                String input = JOptionPane.showInputDialog("How many messages would you like to enter?");
                int numberOfMessages = Integer.parseInt(input);

                String[] messageIDs = new String[numberOfMessages];
                String[] recipients = new String[numberOfMessages];
                String[] messageContents = new String[numberOfMessages];

                Message msgWorker = new Message();

                for (int i = 0; i < numberOfMessages; i++) {
                    messageIDs[i] = JOptionPane.showInputDialog("Enter the Message ID for message " + (i + 1));
                    recipients[i] = JOptionPane.showInputDialog("Enter the Recipient name:");
                    messageContents[i] = JOptionPane.showInputDialog("Enter your message:");

                    String response = msgWorker.captureMessageData(messageIDs[i], recipients[i], messageContents[i]);
                    JOptionPane.showMessageDialog(null, response);
                }

                JOptionPane.showMessageDialog(null, "All " + numberOfMessages + " messages have been captured successfully!");
            }
        }
    }
}