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
        assertTrue(UserRegistration.phoneNumber("91 7020558545"));
        assertFalse(UserRegistration.phoneNumber("01234567890"));
    }
    @Test
    public void testPassword() throws UserRegistrationException {
        assertTrue(UserRegistration.passwordRule1("12asHU@#"));
        assertFalse(UserRegistration.passwordRule1("aabcd"));
    }
    @Test
    public void testPassword1() throws UserRegistrationException {
        assertTrue(UserRegistration.passwordRule2("AsHushir"));
        assertFalse(UserRegistration.passwordRule2("ashwbhw"));
    }
}