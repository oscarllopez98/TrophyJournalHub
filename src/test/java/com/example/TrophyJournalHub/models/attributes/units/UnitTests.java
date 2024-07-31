package com.example.TrophyJournalHub.models.attributes.units;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {

    @Test
    void testWeightUnit() {
        assertEquals("KG", WeightUnit.KG.getUnit());
        assertEquals("LB", WeightUnit.LB.getUnit());
    }

    @Test
    void testDistanceUnit() {
        assertEquals("KM", DistanceUnit.KM.getUnit());
        assertEquals("MI", DistanceUnit.MI.getUnit());
        assertEquals("FT", DistanceUnit.FT.getUnit());
        assertEquals("M", DistanceUnit.M.getUnit());
        assertEquals("YD", DistanceUnit.YD.getUnit());
    }

    @Test
    void testNoUnit() {
        NoUnit noUnit = new NoUnit();
        assertEquals("", noUnit.getUnit());
    }
}
