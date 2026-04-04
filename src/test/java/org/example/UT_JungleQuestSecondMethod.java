package org.example;
import exercise.JungleQuest;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class UT_JungleQuestSecondMethod {
    @Test
    public void calculateFoodSuppliesTest() {
        JungleQuest jungleQuest = new JungleQuest();
        assertNotNull(jungleQuest.calculateFoodSupplies(new ArrayList<>()), "Expected non-null result!");
    }
}
