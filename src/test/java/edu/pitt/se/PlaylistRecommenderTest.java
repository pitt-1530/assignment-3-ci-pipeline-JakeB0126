package edu.pitt.se;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class PlaylistRecommenderTest {
    @Test
    public void testClassEnergyHigh() {
        List<Integer> bpms = List.of(170, 130, 150, 150);
        assertEquals("HIGH", PlaylistRecommender.classifyEnergy(bpms));
    }

    @Test
    public void testInvalidTitle() {
        assertFalse(PlaylistRecommender.isValidTrackTitle("#1 in the World"));
    }

    @Test
    public void testValidTitle() {
        assertTrue(PlaylistRecommender.isValidTrackTitle("Key to my Heart"));
    }

    @Test 
    public void testNormalizeOutofRange(){
        assertEquals(100, PlaylistRecommender.normalizeVolume(160));
        assertEquals(0, PlaylistRecommender.normalizeVolume(-5));
    }

}
