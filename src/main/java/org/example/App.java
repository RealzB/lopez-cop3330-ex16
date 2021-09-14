package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Brandon Lopez
 */
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your age?");
        String uiage = sc.nextLine();
        Integer age = Integer.valueOf(uiage);

        int requiredAge = 16;

        String result = age >= requiredAge ? "You are old enough to legally drive." : "You are not old enough to legally drive.";

        System.out.println(result);







    }
}