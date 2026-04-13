//name: cyd heldsinger
//st number:st10499467
//date: 13 april 2026
//poe part1
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe_part1;

public class Login {

    private String regUser;
    private String regPass;
    private String fName;
    private String lName;

    // Check username rules
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Password complexity check using regex
    public boolean checkPasswordComplexity(String password) {
        String pattern = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]).{8,}$";
        return password.matches(pattern);
    }

    // Handles registration logic and returns status
    public String registerUser(String username, String password) {
        if (!checkUserName(username)) {
            return "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.";
        }
        if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
        }

        this.regUser = username;
        this.regPass = password;
        return "Username and password successfully captured.";
    }

    // Verify login credentials
    public boolean loginUser(String username, String password) {
        return username.equals(regUser) && password.equals(regPass);
    }

    // Return final login message
    public String returnLoginStatus(boolean loggedIn) {
        if (loggedIn) {
            return "Welcome " + fName + ", " + lName + " it is great to see you again.";
        }
        return "Username or password incorrect, please try again.";
    }

    public void setNames(String first, String last) {
        this.fName = first;
        this.lName = last;
    }
}