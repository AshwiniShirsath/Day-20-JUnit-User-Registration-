package com.bridgelabz.junituserregistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class UserRegistrationTest {

    @Test
    public void testFirstName() throws UserRegistrationException {
        assertTrue(UserRegistration.firstName("Ashwini"));
        assertFalse(UserRegistration.firstName("asdhjas"));
    }
}