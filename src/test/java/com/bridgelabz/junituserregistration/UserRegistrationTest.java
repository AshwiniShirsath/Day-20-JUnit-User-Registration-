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
    @Test
    public void testPassword2() throws UserRegistrationException {
        assertTrue(UserRegistration.passwordRule3("Password1"));
        assertFalse(UserRegistration.passwordRule3("jndkajdj"));
    }
    @Test
    public void testPassword3() throws UserRegistrationException {
        assertTrue(UserRegistration.passwordRule4("Password@123"));
        assertFalse(UserRegistration.passwordRule4("asadf12s@@"));
    }
}