package com.sysgears;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class {@link Task2}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.07.16
 */

public class Task2 {

    public static void main(String[] args) throws IOException {
        int number;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число: ");
        number = Integer.parseInt(br.readLine());
        int g = nextLargestPalindrome(number);
        System.out.println(g);
    }

    /**
     * Method of making lists of numbers and return number-palindrome
     *
     * @param number
     * @return number-palindrome
     */
    static int nextLargestPalindrome(int number) {
        for (int i = number + 1; ; i++) {
            if (isPalindrome(i)) {
                return i;
            }
        }
    }

    /**
     * Method search number-palindrome and return true or false
     *
     * @param number
     * @return result (true or false)
     */
    static boolean isPalindrome(int number) {
        String stringNumber = String.valueOf(number);
        String reverseStringNumber = new StringBuffer(stringNumber).reverse().toString();
        if (stringNumber.equals(reverseStringNumber)) {
            return true;
        } else return false;
    }
}