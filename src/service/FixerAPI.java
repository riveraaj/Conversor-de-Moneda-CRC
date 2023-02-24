package service;

import org.json.JSONObject;
import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class FixerAPI {

    public String getRequest(String original, String toConvert, int amount){

        final String URL_API = "https://api.apilayer.com/fixer/convert?to=" + original + "&from=" + toConvert + "&amount=" + amount;

        try {
            HttpRequest getRequest = HttpRequest.newBuilder()
                    .uri(new URI(URL_API))
                    .header("apikey", "JYgchd0ByyKvrrl2zZTrOAqeST4JUZ7j")
                    .build();

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpResponse<String> postResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());

            JSONObject jsonObject = new JSONObject(postResponse.body());
            return jsonObject.get("result").toString();

        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
