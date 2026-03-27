package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class WelcomeTest {
    @Test
    public void testBonjourVendredi12h() {
        LocalDateTime vendredi12h = LocalDateTime.of(2026, 3, 27, 12, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(vendredi12h));
        assertEquals("Bonjour", welcome.getMessage());
    }
    @Test
    public void testBonaprèsmidiVendredi16h() {
        LocalDateTime vendredi16h = LocalDateTime.of(2026, 3, 27, 16, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(vendredi16h));
        assertEquals("Bon après-midi", welcome.getMessage());
    }
    @Test
    public void testBonWeekendVendredi19h() {
        LocalDateTime vendredi19h = LocalDateTime.of(2026, 3, 27, 19, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(vendredi19h));
        assertEquals("Bon week-end", welcome.getMessage());
    }
    @Test
    public void testBonWeekendSamedi10h() {
        LocalDateTime samedi10h = LocalDateTime.of(2026, 3, 28, 10, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(samedi10h));
        assertEquals("Bon week-end", welcome.getMessage());
    }
    @Test
    public void testBonWeekendDimanche10h() {
        LocalDateTime dimanche10h = LocalDateTime.of(2026, 3, 29, 10, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(dimanche10h));
        assertEquals("Bon week-end", welcome.getMessage());
    }
    @Test
    public void testBonjourLundi8h() {
        LocalDateTime lundi8h = LocalDateTime.of(2026, 3, 23, 8, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(lundi8h));
        assertEquals("Bon week-end", welcome.getMessage());
    }
    @Test
    public void testBonjourLundi10h() {
        LocalDateTime lundi10h = LocalDateTime.of(2026, 3, 23, 10, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(lundi10h));
        assertEquals("Bonjour", welcome.getMessage());
    }
    @Test
    public void testBonaprèsmidiMardi14h() {
        LocalDateTime mardi14h = LocalDateTime.of(2026, 3, 24, 14, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(mardi14h));
        assertEquals("Bon après-midi", welcome.getMessage());
    }
    @Test
    public void testBonaprèsmidiMercredi16h() {
        LocalDateTime mercredi16h = LocalDateTime.of(2026, 3, 25, 16, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(mercredi16h));
        assertEquals("Bon après-midi", welcome.getMessage());
    }
    @Test
    public void testBonsoirJeudi18h() {
        LocalDateTime jeudi18h = LocalDateTime.of(2026, 3, 26, 18, 0);
        Welcome welcome = new Welcome(new FakeTimeProvider(jeudi18h));
        assertEquals("Bonsoir", welcome.getMessage());
    }
}