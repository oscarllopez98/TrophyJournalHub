package com.example.TrophyJournalHub.models.attributes;
import com.example.TrophyJournalHub.models.ExerciseAttribute;
import com.example.TrophyJournalHub.models.attributes.units.NoUnit;
import com.example.TrophyJournalHub.models.attributes.values.IntensityValue;

// File: Intensity.java
public class Intensity extends ExerciseAttribute<IntensityValue, NoUnit> {

    public Intensity(IntensityValue intensity) {
        super("Intensity", intensity, new NoUnit());
    }

    public Intensity(String intensityStr) {
        super("Intensity", convertStringToIntensityValue(intensityStr), new NoUnit());
    }

    private static IntensityValue convertStringToIntensityValue(String intensityStr) {
        try {
            return IntensityValue.valueOf(intensityStr.toUpperCase());
        } catch (IllegalArgumentException e) {
            return IntensityValue.NA;
        }
    }
    
    public IntensityValue getIntensity() {
        return getValue();
    }
}
