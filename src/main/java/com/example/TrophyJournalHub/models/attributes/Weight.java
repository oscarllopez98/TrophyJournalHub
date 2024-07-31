package com.example.TrophyJournalHub.models.attributes;

import com.example.TrophyJournalHub.models.ExerciseAttribute;
import com.example.TrophyJournalHub.models.attributes.units.WeightUnit;
import com.example.TrophyJournalHub.models.attributes.values.DoubleValue;

// File: Weight.java
public class Weight extends ExerciseAttribute<DoubleValue, WeightUnit> {
    public Weight(DoubleValue value, WeightUnit unit) {
        super("Weight", value, unit);
    }
}