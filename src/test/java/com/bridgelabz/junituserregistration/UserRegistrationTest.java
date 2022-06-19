package com.bridgelabz.junituserregistration;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class UserRegistrationTest {

    @Test
    public void testFirstName() throws UserRegistrationException {
        assertTrue(UserRegistration.firstName("Ashwini"));
        assertFalse(UserRegistration.firstName("asdhjas"));
    }
    @Test
    public void testLastName() throws UserRegistrationException {
        assertTrue(UserRegistration.lastName("Shirsath"));
        assertFalse(UserRegistration.lastName("ahh"));
    }
    @Test
    public void testEmail() throws UserRegistrationException {
        assertTrue(UserRegistration.email("ashwinishisarth@gamil.com"));
        assertFalse(UserRegistration.email("archushirsath4.u,123"));
    }
    @Test
    public void testPhoneNumber() throws UserRegistrationException {
        assertFalse(UserRegistration.phoneNumber("917020558545"));
        assertTrue(UserRegistration.phoneNumber("0 1234567890"));
    }
}