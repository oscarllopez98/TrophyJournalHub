package com.example.TrophyJournalHub.models.attributes;

import com.example.TrophyJournalHub.models.ExerciseAttribute;
import com.example.TrophyJournalHub.models.attributes.units.NoUnit;
import com.example.TrophyJournalHub.models.attributes.values.IntegerValue;

// File: Reps.java
public class Sets extends ExerciseAttribute<IntegerValue, NoUnit> {
    public Sets(IntegerValue value) {
        super("Sets", value, new NoUnit());
    }
}
