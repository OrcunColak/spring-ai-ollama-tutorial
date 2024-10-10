package com.colak.springtutorial.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LlamaAiService {

    private final OllamaChatClient chatClient;

    public LlamaResponse generateMessage(String promptMessage) {
        final String llamaMessage = chatClient.generate(promptMessage);
        return new LlamaResponse(llamaMessage);
    }

    public LlamaResponse generateJoke(String topic) {
        String promptMessage = String.format("Tell me a joke about %s", topic);
        final String llamaMessage = chatClient.generate(promptMessage);
        return new LlamaResponse(llamaMessage);
    }
}
