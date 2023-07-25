package org.aws;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloworldTest {

    @Test
    public void testHandleRequest() {
        Helloworld helloworld = new Helloworld();

        // Create the input for the Lambda function
        Map<String, Object> input = new HashMap<>();

        // You can add any additional input parameters needed by your Lambda function
        // For example, if your Lambda function expects a query parameter named "name"
        // input.put("queryStringParameters", Collections.singletonMap("name", "John"));

        // Invoke the Lambda function
        Helloworld.ApiGatewayResponse response = helloworld.handleRequest(input, null);

        // Assert the response
        assertEquals("\"Hello AWS World\"", response.getBody());
        assertEquals(200, response.getStatusCode());
        assertEquals("application/json", response.getHeaders().get("Content-Type"));
    }
}
