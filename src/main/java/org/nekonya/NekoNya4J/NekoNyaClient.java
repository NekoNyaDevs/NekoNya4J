package org.nekonya.NekoNya4J;

import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NekoNyaClient implements NekoNyaInterface {
    private final String URL = "https://nekonya.classy.works";
    private final String API_VERSION = "v1";
    private HttpURLConnection conn;

    private static String parse(String json) {
        JSONObject obj = new JSONObject(json);
        return obj.getString("url");
    }

    public String get(String endpoint) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL + "/api/" + API_VERSION + "/" + endpoint)).build();
        String obj = client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .join();

        return parse(obj);
    }

    public String neko() {
        return get("random/neko");
    }

    public String kitsune() {
        return get("random/kitsune");
    }

    public String lewd() {
        return get("random/lewd");
    }

    public String hug() {
        return get("random/hug");
    }

    public String kiss() {
        return get("random/kiss");
    }

    public String pat() {
        return get("random/pat");
    }
}
