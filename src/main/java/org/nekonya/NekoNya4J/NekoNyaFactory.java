package org.nekonya.NekoNya4J;

public final class NekoNyaFactory {
    public static NekoNyaInterface create() {
        return new NekoNyaClient();
    }
}