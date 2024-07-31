package com.example.TrophyJournalHub.models.attributes.values;

// File: TimeValue.java
public class TimeValue implements AttributeValue{
    private int value;

    public TimeValue(int value) {
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
