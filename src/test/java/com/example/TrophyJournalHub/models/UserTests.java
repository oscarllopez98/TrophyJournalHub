package com.example.TrophyJournalHub.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTests {

    private User user;

    @BeforeEach
    public void setUp() {
        user = new User();
        user.setId(1L);
        user.setUsername("testuser");
        user.setEmail("testuser@example.com");
        user.setName("Test User");
        user.setEmailVerified(true);
        user.setConfirmationStatus(true);
    }

    @Test
    public void testGetId() {
        assertEquals(1L, user.getId());
    }

    @Test
    public void testGetUsername() {
        assertEquals("testuser", user.getUsername());
    }

    @Test
    public void testGetEmail() {
        assertEquals("testuser@example.com", user.getEmail());
    }

    @Test
    public void testGetName() {
        assertEquals("Test User", user.getName());
    }

    @Test
    public void testIsEmailVerified() {
        assertTrue(user.isEmailVerified());
    }

    @Test
    public void testIsConfirmationStatus() {
        assertTrue(user.isConfirmationStatus());
    }
}