package com.bridgelabz.junituserregistration;
/*
 * As a User need to enter a valid Last Name
 * @author : Ashwini
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean firstName(String firstName) throws UserRegistrationException {
        if (firstName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (firstName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        {
            String regex = "^[A-Z]{1}[a-z]{2,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(firstName);
            return matcher.matches();
        }
    }
    public static boolean lastName(String lastName) throws UserRegistrationException {
        if (lastName == null) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.NULL, " Input can't be Null");
        } else if (lastName.length() == 0) {
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMPTY, "Invalid Input");
        }
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }
}