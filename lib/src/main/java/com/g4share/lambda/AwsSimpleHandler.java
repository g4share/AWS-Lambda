// Copyright (c) 2024 g4share

package com.g4share.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.g4share.common.SimpleHandler;

public class AwsSimpleHandler implements RequestHandler<String, String> {
    private final SimpleHandler handler = new SimpleHandler();

    @Override
    public String handleRequest(String input, Context context) {
        return handler.handleRequest(input, context.getLogger());
    }
}
