package fr.classydev.NekoNya4J;

import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * The NekoNya class is a simple wrapper for the NekoNya API
 * @see <a href="https://docs.classydev.fr/nekonya/docs/api">https://docs.classydev.fr/nekonya/docs/api</a>
 */
public class NekoNya {
    public final String BASE_URL = "https://nekonya.classydev.fr";
    private final String API_VERSION = "v1";

    private static String parse(String json, String key) {
        return new JSONObject(json).getString(key);
    }

    /**
     * Send a GET request to the API
     * @param endpoint the endpoint to send the request to
     * @return the response of the request
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api">https://docs.classydev.fr/nekonya/docs/api</a>
     */
    public String get(String endpoint) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(BASE_URL + "/api/" + API_VERSION + "/" + endpoint)).build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .join();
    }

    /**
     * Send a POST request to the API
     * @param endpoint the endpoint to send the request to
     * @param jsonBody the body of the request
     * @return the response of the request
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api">https://docs.classydev.fr/nekonya/docs/api</a>
     */
    public String post(String endpoint, String jsonBody) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(BASE_URL + "/api/" + API_VERSION + "/" + endpoint))
            .header("Content-Type", "application/json")
            .POST(HttpRequest.BodyPublishers.ofString(jsonBody))
            .build();

        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .join();
    }

    /**
     * Get a random neko image
     * @return the url of the image
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api/random">https://docs.classydev.fr/nekonya/docs/api/random</a>
     */
    public String getNeko() {
        return parse(this.get("random/neko"), "url");
    }

    /**
     * Get a random kitsune image
     * @return the url of the image
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api/random">https://docs.classydev.fr/nekonya/docs/api/random</a>
     */
    public String getKitsune() {
        return parse(this.get("random/kitsune"), "url");
    }

    /**
     * Get a random pat image
     * @return the url of the image
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api/random">https://docs.classydev.fr/nekonya/docs/api/random</a>
     */
    public String getPat() {
        return parse(this.get("random/pat"), "url");
    }

    /**
     * Get a random hug image
     * @return the url of the image
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api/random">https://docs.classydev.fr/nekonya/docs/api/random</a>
     */
    public String getHug() {
        return parse(this.get("random/hug"), "url");
    }

    /**
     * Get a random slap image
     * @return the url of the image
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api/random">https://docs.classydev.fr/nekonya/docs/api/random</a>
     */
    public String getSlap() {
        return parse(this.get("random/slap"), "url");
    }

    /**
     * Get a random kiss image
     * @return the url of the image
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api/random">https://docs.classydev.fr/nekonya/docs/api/random</a>
     */
    public String getKiss() {
        return parse(this.get("random/kiss"), "url");
    }

    /**
     * Get a random 8ball answer
     * @return the answer
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api/8ball">https://docs.classydev.fr/nekonya/docs/api/8ball</a>
     */
    public String getEightBall() {
        return getEightBall(false);
    }

    /**
     * Get a random 8ball answer
     * @param cute if the answer should be cute
     * @return the answer
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api/8ball">https://docs.classydev.fr/nekonya/docs/api/8ball</a>
     */
    public String getEightBall(boolean cute) {
        return parse(this.get("8ball" + (cute ? "?cute=true" : "")), "answer");
    }

    /**
     * Make your text cute!
     * @param text the text to make cute
     * @return the cute text
     * @see <a href="https://docs.classydev.fr/nekonya/docs/api/owoify">https://docs.classydev.fr/nekonya/docs/api/owoify</a>
     */
    public String owoify(String text) {
        // we build a JSONObject with the text to owoify
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("text", text);
        // we send the request to the API and get the result property from the response
        return parse(this.post("owoify", jsonObject.toString()), "result");
    }
}
