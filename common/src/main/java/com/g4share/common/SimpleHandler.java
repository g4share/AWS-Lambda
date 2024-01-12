// Copyright (c) 2024 g4share

package com.g4share.common;

import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class SimpleHandler {
    public String handleRequest(String input, LambdaLogger logger) {
        logger.log("JDK Version: " + System.getProperty("java.version"));
        return input.toUpperCase();
    }
}
