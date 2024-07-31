package com.example.TrophyJournalHub.models;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.TrophyJournalHub.models.attributes.Intensity;
import com.example.TrophyJournalHub.models.attributes.Level;
import com.example.TrophyJournalHub.models.attributes.Time;
import com.example.TrophyJournalHub.models.attributes.Weight;
import com.example.TrophyJournalHub.models.attributes.units.NoUnit;
import com.example.TrophyJournalHub.models.attributes.units.WeightUnit;
import com.example.TrophyJournalHub.models.attributes.values.DoubleValue;
import com.example.TrophyJournalHub.models.attributes.values.IntensityValue;
import com.example.TrophyJournalHub.models.attributes.values.LevelValue;
import com.example.TrophyJournalHub.models.attributes.values.TimeValue;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseAttributeTests {

    private static final Logger logger = LoggerFactory.getLogger(ExerciseAttributeTests.class);

    @Test
    void testInvalidIntensity() {
        logger.debug("Starting testInvalidIntensity");
        Intensity invalidIntensity = new Intensity("invalid");
        assertEquals(IntensityValue.NA, invalidIntensity.getValue());
        logger.debug("Finished testInvalidIntensity");
    }

    @Test
    void testLevel() {
        logger.debug("Starting testLevel");
        LevelValue levelValue = LevelValue.FIVE;
        Level level = new Level(levelValue);
        assertEquals("Level", level.getName());
        assertEquals(levelValue, level.getValue());
        assertEquals(new NoUnit(), level.getUnit());

        Level levelFromString = new Level("five");
        assertEquals(LevelValue.FIVE, levelFromString.getValue());

        Level invalidLevel = new Level("invalid");
        assertEquals(LevelValue.NA, invalidLevel.getValue());
        logger.debug("Finished testLevel");
    }

    @Test
    void testTime() {
        logger.debug("Starting testTime");
        TimeValue value = new TimeValue(60);
        Time time = new Time(value);
        assertEquals("Time", time.getName());
        assertEquals(value, time.getValue());
        assertEquals(new NoUnit(), time.getUnit());
        logger.debug("Finished testTime");
    }

    @Test
    void testWeight() {
        logger.debug("Starting testWeight");
        DoubleValue value = new DoubleValue(70.5);
        WeightUnit unit = WeightUnit.KG;
        Weight weight = new Weight(value, unit);
        assertEquals("Weight", weight.getName());
        assertEquals(value, weight.getValue());
        assertEquals(unit, weight.getUnit());
        logger.debug("Finished testWeight");
    }
}