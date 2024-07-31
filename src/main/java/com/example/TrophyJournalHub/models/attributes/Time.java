package com.example.TrophyJournalHub.models.attributes;

import com.example.TrophyJournalHub.models.ExerciseAttribute;
import com.example.TrophyJournalHub.models.attributes.units.NoUnit;
import com.example.TrophyJournalHub.models.attributes.values.TimeValue;

public class Time extends ExerciseAttribute<TimeValue, NoUnit> {
    public Time(TimeValue value) {
        super("Time", value, new NoUnit());
    }
}