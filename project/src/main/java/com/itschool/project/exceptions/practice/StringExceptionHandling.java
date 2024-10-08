package com.itschool.project.exceptions.practice;

public class StringExceptionHandling {

    public static void main(String[] args) {
        String input = "Hello world";
        //              012345678910
        int validIndex = 2;
        int invalidIndex = 20;

        printCharAt(input, invalidIndex);
    }

    private static void printCharAt (String input, int index) {
        try {
        System.out.println("Character at index" + index + ": " + input.charAt(index));
    } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("String Index Out Of Bounds Exception: " + exception.getMessage());
        }
    }
}