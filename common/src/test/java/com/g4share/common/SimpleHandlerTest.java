// Copyright (c) 2024 g4share

package com.g4share.common;

import com.amazonaws.services.lambda.runtime.LambdaLogger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class SimpleHandlerTest {

    @Mock
    private LambdaLogger loggerMock;

    @BeforeEach
    public void setUp() {
        doAnswer(call -> {
            System.out.println((String)call.getArgument(0));
            return null;
        }).when(loggerMock).log(anyString());
    }

    private final SimpleHandler handler = new SimpleHandler();

    @Test
    void handleRequest() {
        String actual = handler.handleRequest("Simple AWS Lambda Test", loggerMock);
        assertThat(actual).isEqualTo("SIMPLE AWS LAMBDA TEST");

        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        verify(loggerMock).log(argument.capture());
        assertThat(argument.getValue()).startsWith("JDK Version:");
    }
}