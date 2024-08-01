package com.example.TrophyJournalHub.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.Mockito.*;

import com.example.TrophyJournalHub.models.Exercise;
import com.example.TrophyJournalHub.models.ExerciseRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.Optional;

@WebMvcTest(controllers = ExercisesController.class)
public class ExercisesControllerTests {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @MockBean
    private ExerciseRepository exerciseRepository;

    @BeforeEach
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.webApplicationContext).build();
    }

    @Test
    public void testGetExercises() throws Exception {
        this.mockMvc.perform(get("/exercises"))
            .andExpect(status().isOk());
    }

    @Test
    public void testGetExercise() throws Exception {
        Exercise exercise = new Exercise();
        exercise.setId(1L);
        when(exerciseRepository.findById(1L)).thenReturn(Optional.of(exercise));

        this.mockMvc.perform(get("/exercises/1"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.id").value(1L));
    }

    @Test
    public void testGetExerciseNotFound() throws Exception {
        when(exerciseRepository.findById(1L)).thenReturn(Optional.empty());

        this.mockMvc.perform(get("/exercises/1"))
            .andExpect(status().isNotFound());
    }

    @Test
    public void testCreateExercise() throws Exception {
        Exercise exercise = new Exercise();
        exercise.setId(1L);
        exercise.setName("Push Up");
        when(exerciseRepository.save(any(Exercise.class))).thenReturn(exercise);

        this.mockMvc.perform(post("/exercises")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"name\": \"Push Up\"}"))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.name").value("Push Up"));
    }

    @Test
    public void testUpdateExercise() throws Exception {
        Exercise exercise = new Exercise();
        exercise.setId(1L);
        exercise.setName("Push Up");
        when(exerciseRepository.findById(1L)).thenReturn(Optional.of(exercise));
        when(exerciseRepository.save(any(Exercise.class))).thenReturn(exercise);

        this.mockMvc.perform(put("/exercises/1")
            .contentType(MediaType.APPLICATION_JSON)
            .content("{\"name\": \"Push Up\"}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.name").value("Push Up"));
    }

    @Test
    public void testDeleteExercise() throws Exception {
        Exercise exercise = new Exercise();
        exercise.setId(1L);
        when(exerciseRepository.findById(1L)).thenReturn(Optional.of(exercise));

        this.mockMvc.perform(delete("/exercises/1"))
            .andExpect(status().isNoContent());
    }

    @Test
    public void testDeleteExerciseNotFound() throws Exception {
        when(exerciseRepository.findById(1L)).thenReturn(Optional.empty());

        this.mockMvc.perform(delete("/exercises/1"))
            .andExpect(status().isNotFound());
    }
}