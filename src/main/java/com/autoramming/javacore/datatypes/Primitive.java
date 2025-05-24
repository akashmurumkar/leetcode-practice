package com.autoramming.javacore.datatypes;

public class Primitive {

    public static void main(String[] args) {
        // Primitive data types:
        // > Numeric or Integral data types: int, byte, short, long
        // > Decimal data types: float, double
        // > Non-numeric data types: char, boolean

        // Wrapper classes: Integer, Byte, Short, Long, Float, Double, Character, Boolean

        // Ranges of the data types:
        // byte range: -128 to 127
        // short range: -32,768 to 32,767
        // int range: -2,147,483,648 to 2,147,483,647
        // long range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // float range: 1.4E-45 to 3.4028235E38
        // double range: 4.9E-324 to 1.7976931348623157E308
        // char range: 0 to 65,535
        // boolean range: true or false

        // byte and bit size of all the data types:
        // boolean: 1/8 byte - 1 bit
        // byte: 1 byte - 8 bits
        // short: 2 bytes - 16 bits
        // char: 2 bytes - 16 bits
        // int: 4 bytes - 32 bits
        // float: 4 bytes - 32 bits
        // long: 8 bytes - 64 bits
        // double: 8 bytes - 64 bits

        System.out.println("Byte range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        byte a = 127;
        System.out.println("Example byte value: " + a);
        System.out.println("--------------------");

        System.out.println("Short range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        short b = 32767;
        System.out.println("Example short value: " + b);
        System.out.println("--------------------");

        System.out.println("Integer range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        int c = 2147483647;
        System.out.println("Example integer value: " + c);
        System.out.println("--------------------");


        System.out.println("Long range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        long d = 9223372036854775807L;
        System.out.println("Example long value: " + d);
        System.out.println("--------------------");

        System.out.println("Float range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        float e = 3.14f;
        System.out.println("Example float value: " + e); // ~7 decimal digits
        System.out.println("--------------------");

        System.out.println("Double range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        double f = 3.14159;
        System.out.println("Example double value: " + f); // ~15 decimal digits
        System.out.println("--------------------");

        System.out.println("Char range: " + Character.MIN_VALUE + " to " + Character.MAX_VALUE);
        char g = 'a';
        System.out.println("Example char value: " + g);
        System.out.println("--------------------");

        System.out.println("Boolean values: " + Boolean.TRUE + " and " + Boolean.FALSE);
        boolean h = true;
        System.out.println("Example boolean value: " + h);
        System.out.println("--------------------");

    }

}
