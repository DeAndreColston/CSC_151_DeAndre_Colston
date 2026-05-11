/*
@author: DeAndre Colston
@date: 05/11/2026
@purpose: Week 16 Lab
*/

import java.net.URI;
import java.net.URISyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ChatBot {

    private static final String API_KEY = "AIzaSyDkpGrfXLfH5oquYOtnnmGKBK_7H4yeDAY";
    private static final String API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-3-flash-preview:generateContent?key=" + API_KEY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Chatbot using Gemini 3.0 Flash API");
        System.out.println("-----------------------------------------");
        
        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) break;
            
            try {
                String rawResponse = callGemini(userInput);
                String cleanResponse = parseGeminiResponse(rawResponse);
                System.out.println("Gemini: " + cleanResponse);
                
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        scanner.close();
    }
    private static String callGemini(String text) throws Exception {

        StringBuilder response = new StringBuilder();

        URL url = java.net.URI.create(API_URL).toURL();
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setDoOutput(true);

        String jsonInputString = """
        {
            "contents": [{
            "parts": [{"text":"%s"}]
            }]
        } 
        """.formatted(text);

        try (OutputStream os = connection.getOutputStream()) {
            byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8))) {
            String responseLine;
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine.trim());
            }
            return response.toString();
        }
    }
    //took a while to finally set up the chat bot itself under the responses with constant error messages
    private static String parseGeminiResponse(String rawJson) {
        try {
            String searchString = "\"text\":";
            int text = rawJson.indexOf("\"text\"");
            if (text == -1) return "No text found.";

            int start = rawJson.indexOf("\"", text + 6) + 1;

            int end = rawJson.indexOf("\"", start);

            return rawJson.substring(start, end)
            .replace("\\n", "\n")
            .replace("\\\"", "\"")
            .replace("**", "");

        } catch (Exception e) {
            return "Could not parse response: " + e.getMessage();
        }
    }
}   