package com.autoramming;

/** PROBLEM STATEMENT
 * In an Excel, the columns A, B, C etc. is numbered as 1, 2, 3 in a java program
 * So, when a user gives a number input the output should be the column character like
 * for input: 1 the output should be A
 * for input: 27 the output should be AA
 * for input: 676 the output should be YZ
 */

public class ExcelCharacterOutput {

    public static void main(String[] args) {
        System.out.println(convertToExcelColumn(1));    // Output: A
        System.out.println(convertToExcelColumn(27));   // Output: AA
        System.out.println(convertToExcelColumn(676));  // Output: YZ
        System.out.println(convertToExcelColumn(702));  // Output: ZZ
        System.out.println(convertToExcelColumn(703));  // Output: AAA

        System.out.println(numberToColumnName(1));    // Output: A
        System.out.println(numberToColumnName(27));   // Output: AA
        System.out.println(numberToColumnName(676));  // Output: YZ
        System.out.println(numberToColumnName(702));  // Output: ZZ
        System.out.println(numberToColumnName(703));  // Output: AAA
    }

    public static String convertToExcelColumn(int num) {
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            int remainder = num % 26;
            if (remainder == 0) {
                remainder = 26;
                num--;
            }
            result.insert(0, (char) ('A' + remainder - 1));
            num /= 26;
        }
        return result.toString();
    }

    public static String numberToColumnName(int number) {
        StringBuilder columnName = new StringBuilder();
        while (number > 0) {
            number--; // Adjust to 0-based index
            int remainder = number % 26;
            char currentChar = (char) ('A' + remainder);
            columnName.insert(0, currentChar);
            number = number / 26;
        }

        return columnName.toString();
    }

}
