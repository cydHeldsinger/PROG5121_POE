//name: cyd heldsinger
//st number:st10499467
//date: 13 april 2026
//poe part1
/*
 
 */
package poe_part1;

import javax.swing.JOptionPane;

public class Login {

    
    private String regFirst;
    private String regLast;
    private String regUser;
    private String regPass;

    
    public boolean checkUserName(String username) {
        return username.contains("_") && username.length() <= 5;
    }

   
    public boolean checkPasswordComplexity(String password) {
        boolean hasUpper = false;
        boolean hasNum = false;
        boolean hasSpecial = false;

        if (password.length() >= 8) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) hasUpper = true;
                if (Character.isDigit(c)) hasNum = true;
                if (c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*')
                    hasSpecial = true;
            }
        }
        return hasUpper && hasNum && hasSpecial;
    }

    
    public String registerUser(String firstName, String lastName, String username, String password) {
        this.regFirst = firstName;
        this.regLast = lastName;

        if (!checkUserName(username)) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        } else if (!checkPasswordComplexity(password)) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.";
        } else {
            this.regUser = username;
            this.regPass = password;
            return "Username and password successfully captured.";
        }
    }

    
    public boolean loginUser(String username, String password) {
        return username.equals(this.regUser) && password.equals(this.regPass);
    }

    
    public String returnLoginStatus(boolean isLoggedIn) {
        if (isLoggedIn) {
            return "Welcome " + regFirst + ", " + regLast + " it is great to see you again.";
        } else {
            return "Username or password incorrect, please try again";
        }
    }
}