// File: ExerciseAttribute.java
package com.example.TrophyJournalHub.models;

import com.example.TrophyJournalHub.models.attributes.units.Unit;
import com.example.TrophyJournalHub.models.attributes.values.AttributeValue;

// File: ExerciseAttribute.java
public abstract class ExerciseAttribute<T extends AttributeValue, U extends Unit> {
    private String name;
    private T value;
    private U unit;

    public ExerciseAttribute(String name, T value, U unit) {
        this.name = name;
        this.value = value;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public T getValue() {
        return value;
    }

    public U getUnit() {
        return unit;
    }
}