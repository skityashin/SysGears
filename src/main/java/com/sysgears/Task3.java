package com.sysgears;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Class {@link Task3}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.07.16
 */

public class Task3 {
    public static void main(String[] args) {
        String array[] = new String[]{"five", "fivetwo", "fourfive", "fourfivetwo", "one", "onefiveone", "two", "twofivefourone"};
        ArrayList<String> words = new ArrayList<>();

        for (int i = 0; i < array.length; ++i) {
            for (int j = 0; j < array.length; ++j) {
                for (int k = 0; k < array.length; ++k) {
                    if ((i != j && i != k && j != k) && (array[i].equals(array[j] + array[k]) || array[i].equals(array[k] + array[j])))
                        words.add(array[i]);
                }
            }
        }
        // find the longest word in ArrayList words
        Collections.sort(words, (a, b) -> b.length() - a.length());
        System.out.println("Самое длинное составное слово: " + words.get(0));
    }
}
