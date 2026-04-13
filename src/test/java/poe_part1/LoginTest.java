// Testing logic and Assertions adapted from JUnit 5 User Guide
// URL: https://junit.org/junit5/docs/current/user-guide/

package poe_part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class LoginTest {

    // Instantiate the Login class to be used in tests
    Login login = new Login();

    @Test
    public void testUsernameSuccess() {
        // Expected: True (contains _ and length <= 5)
        assertTrue(login.checkUserName("ky_1"));
    }

    @Test
    public void testUsernameFailure() {
        // Expected: False (too long and no _)
        assertFalse(login.checkUserName("kyle!!!!!!!"));
    }

    @Test
    public void testPasswordSuccess() {
        // Expected: True (8+ chars, Cap, Num, Special)
        assertTrue(login.checkPasswordComplexity("Ch33se!!")); 
    }

    @Test
    public void testPasswordFailure() {
        // Expected: False (no complexity)
        assertFalse(login.checkPasswordComplexity("password"));
    }
}