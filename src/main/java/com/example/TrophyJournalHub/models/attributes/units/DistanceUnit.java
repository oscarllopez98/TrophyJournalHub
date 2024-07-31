package com.example.TrophyJournalHub.models.attributes.units;

// File: WeightUnit.java
public enum DistanceUnit implements Unit {
    KM, MI, FT, M, YD;

    @Override
    public String getUnit() {
        return this.name();
    }
}