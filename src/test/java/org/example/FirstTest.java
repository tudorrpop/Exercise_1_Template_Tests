package org.example;
import exercise.JungleQuest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Tag("public")
public class FirstTest {
    @Test
    public void categorizeExpeditionTeamsTest() {
        JungleQuest jungleQuest = new JungleQuest();
        assertNotNull(jungleQuest.categorizeExpeditionTeams(new ArrayList<>(), 0, 0),
                "categorizeExpeditionTeams should not return null values");
    }
}
