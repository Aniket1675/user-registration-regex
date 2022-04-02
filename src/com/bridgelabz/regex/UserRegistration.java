package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Program on User Registration Using Regex
 *
 * @author : Aniket
 * @since : 01/04/2022
 * */

public class UserRegistration {
    // (?=.*[a-z]) # a lower case letter must occur at least once
    // (?=.*[A-Z]) # an upper case letter must occur at least once

    public void firstName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name is: ");
        String fname = sc.nextLine();
        String regexFname = "^[A-Z]{1}[a-z]{2,}";

        if (fname.matches(regexFname) == true) {
            System.out.println("The first name " + fname + " is valid.");
        } else {
            System.out.println("The first name " + fname + " is invalid.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the user registration problem");
    }
}
