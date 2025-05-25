package com.autoramming.javacore.datatypes;

public class Identifiers {

    public static void main(String[] args) {
        // Identifiers:
        // Variable names
        // Class names
        // Method names
        // Package names
        // Interface names
        // Exception names

        // Identifier naming conventions:
        // 1. Start with a letter or underscore
        // 2. Can contain letters, digits, underscores, and dollar signs
        // 3. Cannot start with a digit
        // 4. Must be unique within the scope of the identifier

        // Examples of valid identifiers:
        int myVariable = 10;
        String name = "John Doe";
        int _myVariable = 20;
        int $myVariable = 30;
        int my_variable = 40;

        // Examples of invalid identifiers:
        // int 10myVariable = 50;
        // int my-variable = 60;
        // int my variable = 70;

        // Variable names example
        int age = 10;
        String person = "John Doe";

        // Class names example
        Identifiers identifiersExample = new Identifiers();

        // Method names example
        printMessage();

        // Package names example
        com.autoramming.javacore.datatypes.Primitive primitiveExample = new com.autoramming.javacore.datatypes.Primitive();

        // Interface names example
        Runnable myRunnable = new Runnable() {
            public void run() {
                System.out.println("Running...");
            }
        };

        // Exception names example
        try {
            throw new Exception("Example Exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void printMessage() {
        System.out.println("This is a static method example.");
    }

}
