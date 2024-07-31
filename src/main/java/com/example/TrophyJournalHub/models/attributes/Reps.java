package com.example.TrophyJournalHub.models.attributes;

import com.example.TrophyJournalHub.models.ExerciseAttribute;
import com.example.TrophyJournalHub.models.attributes.units.NoUnit;
import com.example.TrophyJournalHub.models.attributes.values.IntegerValue;

// File: Reps.java
public class Reps extends ExerciseAttribute<IntegerValue, NoUnit> {
    public Reps(IntegerValue value) {
        super("Reps", value, new NoUnit());
    }
}
