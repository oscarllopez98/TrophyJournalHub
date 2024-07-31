package com.example.TrophyJournalHub.models.attributes.units;

// File: WeightUnit.java
public enum WeightUnit implements Unit {
    KG, LB;

    @Override
    public String getUnit() {
        return this.name();
    }
}