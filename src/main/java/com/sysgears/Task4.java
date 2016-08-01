package com.sysgears;

import java.util.*;

/**
 * Class {@link Task4}
 *
 * @author Skityashin Vladimir
 * @version 1.0
 * @since 20.07.16
 */

public class Task4 {

    public static void main(String[] args) {

        int x1 = 0, x2 = 2, x3 = 4, x4 = -5, x5 = -2;
        int y1 = 7, y2 = -6, y3 = 2, y4 = 4, y5 = 0;

        // enter the coordinates in the array is sorted by key
        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(x1, y1);
        treeMap.put(x2, y2);
        treeMap.put(x3, y3);
        treeMap.put(x4, y4);
        treeMap.put(x5, y5);

        // out list of points of coordinates
        int i = 1;
        for (Map.Entry<Integer, Integer> entry : treeMap.entrySet()) {
            System.out.println("(x" + i + "= " + entry.getKey() + "; y" + i + "= " + entry.getValue() + ")");
            ++i;
        }

    }
}
