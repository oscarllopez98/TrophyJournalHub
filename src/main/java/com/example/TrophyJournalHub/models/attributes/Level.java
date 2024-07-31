package com.example.TrophyJournalHub.models.attributes;
import com.example.TrophyJournalHub.models.ExerciseAttribute;
import com.example.TrophyJournalHub.models.attributes.units.NoUnit;
import com.example.TrophyJournalHub.models.attributes.values.LevelValue;

// File: Level.java
public class Level extends ExerciseAttribute<LevelValue, NoUnit> {

    public Level(LevelValue level) {
        super("Level", level, new NoUnit());
    }

    public Level(String levelStr) {
        super("Level", convertStringToLevelValue(levelStr), new NoUnit());
    }

    private static LevelValue convertStringToLevelValue(String levelStr) {
        try {
            return LevelValue.valueOf(levelStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            return LevelValue.NA;
        }
    }
    
    public LevelValue getLevel() {
        return getValue();
    }
}
