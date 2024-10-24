package com.colak.springtutorial.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Component;

@Component
public class OllamaChatClient {

    private final ChatClient chatClient;

    public OllamaChatClient(ChatClient.Builder builder) {
        this.chatClient = builder
                .build();
    }

    public String generate(String promptMessage) {

        return chatClient.prompt()
                .user(promptMessage)
                .call()
                .content();

    }
}
