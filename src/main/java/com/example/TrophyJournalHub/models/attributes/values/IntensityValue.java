package com.example.TrophyJournalHub.models.attributes.values;

public enum IntensityValue implements AttributeValue {
    NA("na"),
    ONE("low"),
    MEDIUM("med"),
    HIGH("high");

    private final String intensity;

    IntensityValue(String intensity) {
        this.intensity = intensity;
    }

    public String getAttributeValue() {
        return intensity;
    }
}