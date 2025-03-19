package fr.classydev.NekoNya4J;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NekoNyaTest {
    @Test
    public void testGetNeko() {
        NekoNya neko = new NekoNya();
        String url = neko.getNeko();
        assertNotNull(url);
        assertTrue(url.startsWith("https://nekonya.classydev.fr/images/"));
    }

    @Test
    public void testGetKitsune() {
        NekoNya neko = new NekoNya();
        String url = neko.getKitsune();
        assertNotNull(url);
        assertTrue(url.startsWith("https://nekonya.classydev.fr/images/"));
    }

    @Test
    public void testGetPat() {
        NekoNya neko = new NekoNya();
        String url = neko.getPat();
        assertNotNull(url);
        assertTrue(url.startsWith("https://nekonya.classydev.fr/images/"));
    }

    @Test
    public void testGetHug() {
        NekoNya neko = new NekoNya();
        String url = neko.getHug();
        assertNotNull(url);
        assertTrue(url.startsWith("https://nekonya.classydev.fr/images/"));
    }

    @Test
    public void testGetSlap() {
        NekoNya neko = new NekoNya();
        String url = neko.getSlap();
        assertNotNull(url);
        assertTrue(url.startsWith("https://nekonya.classydev.fr/images/"));
    }

    @Test
    public void testGetKiss() {
        NekoNya neko = new NekoNya();
        String url = neko.getKiss();
        assertNotNull(url);
        assertTrue(url.startsWith("https://nekonya.classydev.fr/images/"));
    }

    @Test
    public void testGetEightBall() {
        NekoNya neko = new NekoNya();
        String answer = neko.getEightBall();
        assertNotNull(answer);
    }

    @Test
    public void testGetCuteEightBall() {
        NekoNya neko = new NekoNya();
        String answer = neko.getEightBall(true);
        assertNotNull(answer);
    }

    @Test
    public void testOwoifyTest() {
        NekoNya neko = new NekoNya();
        String owoified = neko.owoify("Hello, world!");
        assertNotNull(owoified);
        assertTrue(owoified.contains("Hewwo"));
    }
}
