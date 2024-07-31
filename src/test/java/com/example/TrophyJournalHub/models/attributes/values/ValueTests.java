package com.example.TrophyJournalHub.models.attributes.values;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValueTests {

	@Test
	void testDoubleValue() {
		DoubleValue doubleValue = new DoubleValue(10.5);
		assertEquals("10.5", doubleValue.getAttributeValue());
		assertEquals(10.5, doubleValue.getValue());
	}

	@Test
	void testIntegerValue() {
		IntegerValue integerValue = new IntegerValue(10);
		assertEquals("10", integerValue.getAttributeValue());
		assertEquals(10, integerValue.getValue());
	}

	@Test
	void testIntensityValue() {
		assertEquals("na", IntensityValue.NA.getAttributeValue());
		assertEquals("low", IntensityValue.ONE.getAttributeValue());
		assertEquals("med", IntensityValue.MEDIUM.getAttributeValue());
		assertEquals("high", IntensityValue.HIGH.getAttributeValue());
	}

	@Test
	void testLevelValue() {
		assertEquals("N/A", LevelValue.NA.getAttributeValue());
		assertEquals("1", LevelValue.ONE.getAttributeValue());
		assertEquals("2", LevelValue.TWO.getAttributeValue());
		assertEquals("3", LevelValue.THREE.getAttributeValue());
		assertEquals("4", LevelValue.FOUR.getAttributeValue());
		assertEquals("5", LevelValue.FIVE.getAttributeValue());
		assertEquals("6", LevelValue.SIX.getAttributeValue());
		assertEquals("7", LevelValue.SEVEN.getAttributeValue());
		assertEquals("8", LevelValue.EIGHT.getAttributeValue());
		assertEquals("9", LevelValue.NINE.getAttributeValue());
	}

	@Test
	void testTimeValue() {
		TimeValue timeValue = new TimeValue(60);
		assertEquals("60", timeValue.getAttributeValue());
		assertEquals(60, timeValue.getValue());
	}
}
