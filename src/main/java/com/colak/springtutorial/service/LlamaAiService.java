package com.colak.springtutorial.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LlamaAiService {

    private final OllamaChatClient ollamaChatClient;

    public LlamaResponse generateMessage(String promptMessage) {
        String response = ollamaChatClient.generate(promptMessage);
        return new LlamaResponse(response);
    }

    public LlamaResponse generateJoke(String topic) {
        String promptMessage = String.format("Tell me a joke about %s", topic);
        String response = ollamaChatClient.generate(promptMessage);
        return new LlamaResponse(response);
    }
}
