package org.example;

import exercise.JungleQuest;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Tag("public")
public class UT_JungleQuestSecondMethod {
    @Test
    public void calculateFoodSuppliesTest() {
        JungleQuest jungleQuest = new JungleQuest();
        assertNotNull(jungleQuest.calculateFoodSupplies(new ArrayList<>()),
                "calculateFoodSupplies should not return null values");
    }
}
