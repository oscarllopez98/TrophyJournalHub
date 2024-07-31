package com.example.TrophyJournalHub.models.attributes.units;

// File: NoUnit.java
public class NoUnit implements Unit {
    @Override
    public String getUnit() {
        return "";
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof NoUnit;
    }

    @Override
    public int hashCode() {
        return 31; // Arbitrary constant value
    }
}