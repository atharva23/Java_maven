package org.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.HashMap;
import java.util.Map;

public class Helloworld implements RequestHandler<Map<String, Object>, Helloworld.ApiGatewayResponse> {

    public Helloworld.ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        String body = "\"Hello AWS World\"";

        return new Helloworld.ApiGatewayResponse(body, headers, 200);
    }

    public static class ApiGatewayResponse {
        private final String body;
        private final Map<String, String> headers;
        private final int statusCode;

        public ApiGatewayResponse(String body, Map<String, String> headers, int statusCode) {
            this.body = body;
            this.headers = headers;
            this.statusCode = statusCode;
        }

        public String getBody() {
            return body;
        }

        public Map<String, String> getHeaders() {
            return headers;
        }

        public int getStatusCode() {
            return statusCode;
        }
    }
}
