package com.example.TrophyJournalHub.models.attributes.values;

// File: DoubleValue.java
public class DoubleValue implements AttributeValue {
    private double value;

    public DoubleValue(double value) {
        this.value = value;
    }

    @Override
    public String getAttributeValue() {
        return String.valueOf(value);
    }

    public double getValue() {
        return value;
    }
}