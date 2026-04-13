package poe_part1;

import java.util.Scanner;

public class PROG5121_POE {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login auth = new Login();

        System.out.println("--- Registration ---");

        System.out.print("First Name: ");
        String fName = sc.nextLine();

        System.out.print("Last Name: ");
        String lName = sc.nextLine();
        auth.setNames(fName, lName);

        System.out.print("Username: ");
        String user = sc.nextLine();

        System.out.print("Password: ");
        String pass = sc.nextLine();

        // Register and show result
        String result = auth.registerUser(user, pass);
        System.out.println("\n" + result);

        // Login phase
        if (result.equals("Username and password successfully captured.")) {
            System.out.println("\n--- Login ---");
            System.out.print("Enter Username: ");
            String logUser = sc.nextLine();

            System.out.print("Enter Password: ");
            String logPass = sc.nextLine();

            boolean isOk = auth.loginUser(logUser, logPass);
            System.out.println(auth.returnLoginStatus(isOk));
        }
    }
}