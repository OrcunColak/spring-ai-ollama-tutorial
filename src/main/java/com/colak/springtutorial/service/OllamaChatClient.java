package com.colak.springtutorial.service;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OllamaChatClient {

    private final OllamaChatModel chatModel;

    public void generate(String promptMessage) {

        chatModel.stream(new Prompt(promptMessage))
                .subscribe(chatResponse -> {
                    System.out.print(chatResponse.getResult().getOutput().getContent());
                });

    }
}
