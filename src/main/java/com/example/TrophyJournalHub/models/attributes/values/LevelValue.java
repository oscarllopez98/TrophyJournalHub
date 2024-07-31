package com.example.TrophyJournalHub.models.attributes.values;

public enum LevelValue implements AttributeValue {
    NA("N/A"),
    ONE("1"),
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9");

    private final String level;

    LevelValue(String level) {
        this.level = level;
    }

    public String getAttributeValue() {
        return level;
    }
}