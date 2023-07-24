package org.aws;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloworldTest {
    @Test
    public void handleRequest() {
        Helloworld helloWorld = new Helloworld();
        String result = helloWorld.handleRequest(); // Call without arguments

        // Update the expected string to "<Hello , AWS lambda>"
        String expected = "<Hello , AWS lambda>";
        assertEquals(expected, result);
    }
}
