package com.example.TrophyJournalHub.models.attributes.values;

// File: IntegerValue.java
public class IntegerValue implements AttributeValue {
    private int value;

    public IntegerValue(int value) {
        this.value = value;
    }

    @Override
    public String getAttributeValue() {
        return String.valueOf(value);
    }

    public int getValue() {
        return value;
    }
}