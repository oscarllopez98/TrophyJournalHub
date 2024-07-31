package com.example.TrophyJournalHub.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ExerciseTests {

    @InjectMocks
    private Exercise exercise;

    @Mock
    private ExerciseAttribute<?, ?> attribute;

    private List<ExerciseAttribute<?, ?>> exerciseAttributeList;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        exercise = new Exercise();
        exerciseAttributeList = new ArrayList<>();
    }

    @Test
    public void testSetDateCreated() {
        Date dateCreated = new Date();
        exercise.setDateCreated(dateCreated);
        assertEquals(dateCreated, exercise.getDateCreated());
    }

    @Test
    public void testGetExerciseAttributeList() {
        exercise.setExerciseAttributeList(exerciseAttributeList);
        assertEquals(exerciseAttributeList, exercise.getExerciseAttributeList());
    }

    @Test
    public void testAddExerciseAttribute() {
        exercise.setExerciseAttributeList(exerciseAttributeList);
        exercise.addExerciseAttribute(attribute);
        assertNotNull(exercise.getExerciseAttributeList());
        assertEquals(1, exercise.getExerciseAttributeList().size());
        assertEquals(attribute, exercise.getExerciseAttributeList().get(0));
    }
}