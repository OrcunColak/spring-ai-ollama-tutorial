# Read Me

The original idea is from  
https://howtodoinjava.com/spring-ai/spring-ai-ollama-example/

Run

```
docker run -d -v ollama:/root/.ollama -p 11434:11434 --name ollama ollama/ollama
docker exec -it ollama ollama run llama3
```

```
curl http://localhost:11434/api/generate -d "{\"model\":\"llama3\",\"prompt\":\"Why is the sky blue?\"}" -H "Content-Type: application/json"
```