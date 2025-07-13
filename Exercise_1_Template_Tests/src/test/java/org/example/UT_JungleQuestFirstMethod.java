package org.example;
import exercise.JungleQuest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UT_JungleQuestFirstMethod {
    @Test
    public void categorizeExpeditionTeamsTest() {
        JungleQuest jungleQuest = new JungleQuest();
        assertNotNull(jungleQuest.categorizeExpeditionTeams(new ArrayList<>(), 0, 0));
    }
}
