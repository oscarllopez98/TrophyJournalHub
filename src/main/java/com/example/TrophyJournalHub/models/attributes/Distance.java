package com.example.TrophyJournalHub.models.attributes;
import com.example.TrophyJournalHub.models.attributes.units.DistanceUnit;

import com.example.TrophyJournalHub.models.ExerciseAttribute;
import com.example.TrophyJournalHub.models.attributes.values.DoubleValue;

// File: Distance.java
public class Distance extends ExerciseAttribute<DoubleValue, DistanceUnit> {
    public Distance(DoubleValue value, DistanceUnit unit) {
        super("Distance", value, unit);
    }
}