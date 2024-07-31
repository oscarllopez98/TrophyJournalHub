package com.example.TrophyJournalHub.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Exercise {
    @Id
    @GeneratedValue
    private Long id;
    private String exerciseId;
    private String username;
    private String name;
    private Date dateCreated;
    private List<ExerciseAttribute<?, ?>> exerciseAttributeList;

    public Exercise() {
        this.exerciseAttributeList = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExerciseId() {
        return exerciseId;
    }

    public void setExerciseId(String exerciseId) {
        this.exerciseId = exerciseId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public List<ExerciseAttribute<?, ?>> getExerciseAttributeList() {
        return exerciseAttributeList;
    }

    public void setExerciseAttributeList(List<ExerciseAttribute<?, ?>> exerciseAttributeList) {
        this.exerciseAttributeList = exerciseAttributeList;
    }

    public void addExerciseAttribute(ExerciseAttribute<?, ?> attribute) {
        this.exerciseAttributeList.add(attribute);
    }
}
