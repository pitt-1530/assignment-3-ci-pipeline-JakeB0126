package edu.pitt.se;

import java.util.List;

public class PlaylistRecommender {

    public static String classifyEnergy(List<Integer> bpms) {
        
        if (bpms == null || bpms.isEmpty()) {
            throw new IllegalArgumentException();
        }

        int total = 0;
        for (Integer bpm : bpms) {
            total += bpm;
        }

        int average = total / bpms.size();

        if (average >= 140) {
            return "HIGH";
        } else if (average >= 100) {
            return "MEDIUM";
        } else {
            return "LOW";
        }
        
    }

    public static boolean isValidTrackTitle(String title) {

        if (title == null) {
            return false;
        }

        int len = title.length();

        if (len < 1 || len > 30) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            char c = title.charAt(i);
            if (!Character.isLetter(c) && c != ' ') {
                return false;
            }
        }

        return true;
    }

    public static int normalizeVolume(int volumeDb) {
        if (volumeDb < 0) {
            return 0;
        } else if (volumeDb > 100) {
            return 100;
        } else {
            return volumeDb;
        }
    }
}
