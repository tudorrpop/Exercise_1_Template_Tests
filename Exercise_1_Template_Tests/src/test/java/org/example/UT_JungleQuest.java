package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertNotNull;

public class UT_JungleQuest {

    @Test
    public void categorizeExpeditionTeamsTest() {
        JungleQuest jungleQuest = new JungleQuest();
        assertNotNull(jungleQuest.categorizeExpeditionTeams(new ArrayList<>(), 0, 0));
    }

    @Test
    public void calculateFoodSuppliesTest() {
        JungleQuest jungleQuest = new JungleQuest();
        assertNotNull(jungleQuest.calculateFoodSupplies(new ArrayList<>()));
    }

}
