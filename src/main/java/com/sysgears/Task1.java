package com.sysgears;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;
import com.fasterxml.jackson.dataformat.yaml.snakeyaml.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Class {@link Task1}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.07.16
 */

public class Task1 {

    public static void main(String[] args) throws IOException {

        Integer[] numbers = createRandomArray();
        String fileName = "numbers.yml";
        writeToFile(numbers, fileName);
        Integer uniqueNumber = getUniqueNumber(loadArrayFromFile(fileName));
        System.out.println(uniqueNumber);
    }

    /**
     * Create Array of random of numbers with twice repeating numbers, except for one
     *
     * @return Integer[] numbersArray - Array of random numbers
     */
    public static Integer[] createRandomArray() {
        int sizeArray = 9;
        Integer[] numbersArray = new Integer[sizeArray];
        for (int i = 0; i < numbersArray.length - 1; i++) {
            numbersArray[i] = (int) (Math.random() * 20);
            numbersArray[i + 1] = numbersArray[i];
            i++;
        }
        numbersArray[sizeArray - 1] = (int) (Math.random() * 21);
        return numbersArray;
    }

    /**
     * Writes to the file Array of numbers in the YAML-format
     *
     * @param numbers  - Array of numbers with twice repeating numbers, except for one
     * @param fileName - the name of file to be created, which will be recorded
     * @throws IOException
     */
    public static void writeToFile(Integer[] numbers, String fileName) throws IOException {
        YamlWriter writer = new YamlWriter(new FileWriter(fileName));
        Yaml yaml = new Yaml();
        String out = yaml.dump(numbers);
        writer.write(out);
        writer.close();
    }

    /**
     * Loads List of numbers from file
     *
     * @param fileName - the name of the file created with an array of numbers in the YAML-format
     * @return Integer[]Array - Array of numbers with twice repeating numbers, except for one
     * @throws IOException
     */
    public static Integer[] loadArrayFromFile(String fileName) throws IOException {
        YamlReader reader = new YamlReader(new FileReader(fileName));
        String s = (String) reader.read();
        Yaml yaml = new Yaml();
        List<Integer> numbers_new = (List<Integer>) yaml.load(s);
        Integer[] numbers_new1 = numbers_new.toArray(new Integer[numbers_new.size()]);
        reader.close();
        return numbers_new1;
    }

    /**
     * Get unique number from Array
     *
     * @param numbers_new
     * @return unique number, which occurs only once in the Array
     */
    public static Integer getUniqueNumber(Integer[] numbers_new) {
        int result = numbers_new[0];
        for (int i = 1; i < numbers_new.length; i++) {
            result ^= numbers_new[i];
        }
        return result;
    }
}

