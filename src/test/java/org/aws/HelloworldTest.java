package org.aws;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloworldTest {

    @Test
    void handleRequest() {
        var sut =new Helloworld();
        assertEquals("Hello , AWS lambda", sut.handleRequest());
    }
}