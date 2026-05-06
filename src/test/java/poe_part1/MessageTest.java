package poe_part1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessageTest {

    public MessageTest() {
    }

    /**
     * Test of checkMessageLength method, of class Message.
     */
    @Test
    public void testCheckMessageLength() {
        System.out.println("checkMessageLength");
        Message instance = new Message();

        // Test 1: A short message should be valid (True)
        String validMsg = "This is a short message.";
        boolean result1 = instance.checkMessageLength(validMsg);
        assertTrue(result1, "The message length should be valid.");

        // Test 2: A very long message should be invalid (False)
        String longMsg = "This message is intentionally made to be very long. ".repeat(10);
        boolean result2 = instance.checkMessageLength(longMsg);
        assertFalse(result2, "The message should be too long.");
    }

    /**
     * Test of captureMessageData method, of class Message.
     */
    @Test
    public void testCaptureMessageData() {
        System.out.println("captureMessageData");
        String id = "MSG123";
        String person = "John Doe";
        String content = "Hello there!";
        Message instance = new Message();

        // This should match the success string in your Message.java
        String expResult = "Message successfully captured";
        String result = instance.captureMessageData(id, person, content);

        assertEquals(expResult, result);
    }

    /**
     * Test of returnMessageReport method, of class Message.
     */
    @Test
    public void testReturnMessageReport() {
        System.out.println("returnMessageReport");
        Message instance = new Message();

        // Setting up the data first
        instance.captureMessageData("ID01", "Mike", "Testing report");

        String result = instance.returnMessageReport();

        // We check if the report contains the key details
        assertTrue(result.contains("ID01"));
        assertTrue(result.contains("Mike"));
    }
}