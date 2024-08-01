package com.example.TrophyJournalHub.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.TrophyJournalHub.models.Exercise;
import com.example.TrophyJournalHub.models.ExerciseRepository;

@RestController
@RequestMapping("/exercises")
public class ExercisesController {
    
    private final ExerciseRepository exerciseRepository;

    public ExercisesController(ExerciseRepository exerciseRepository) {
        this.exerciseRepository = exerciseRepository;
    }

    @GetMapping
    public List<Exercise> getExercises() {
        return exerciseRepository.findAll();        
    }

    @GetMapping("/{id}")
    public ResponseEntity<Exercise> getExercise(@PathVariable Long id) {
        return exerciseRepository.findById(id)
            .map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping
    public ResponseEntity<Exercise> createExercise(@RequestBody Exercise exercise) throws URISyntaxException {
        Exercise savedExercise = exerciseRepository.save(exercise);
        URI location = new URI("/users/" + savedExercise.getId());
        return ResponseEntity.created(location).body(savedExercise);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Exercise> updateExercise(@PathVariable Long id, @RequestBody Exercise exercise) {
        Exercise currentExercise = exerciseRepository.findById(id).orElseThrow(RuntimeException::new);
        currentExercise.setName(exercise.getName());
        currentExercise.setUsername(exercise.getUsername());
        currentExercise.setExerciseId(exercise.getExerciseId());
        currentExercise.setDateCreated(exercise.getDateCreated());
        currentExercise.setExerciseAttributeList(exercise.getExerciseAttributeList());

        exerciseRepository.save(currentExercise);

        return ResponseEntity.ok(currentExercise);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteExercise(@PathVariable Long id) {
        return exerciseRepository.findById(id)
                .map(exercise -> {
                    exerciseRepository.delete(exercise);
                    return ResponseEntity.noContent().build();
                })
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

}
