package org.example;

import exercise.JungleQuest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;

@Tag("private")
public class PrivateTests {

    @Test
    public void categorizeExpeditionTeamsTest() {
        JungleQuest jungleQuest = new JungleQuest();
        assertFalse(jungleQuest.categorizeExpeditionTeams(new ArrayList<>(), 0, 0).isEmpty(),
                "categorizeExpeditionTeams should not return an empty map");
    }

    @Test
    public void calculateFoodSuppliesTest() {
        JungleQuest jungleQuest = new JungleQuest();
        assertFalse(jungleQuest.calculateFoodSupplies(new ArrayList<>(), 0, 0).isEmpty(),
                "categorizeExpeditionTeams should not return an empty map");
    }
}
