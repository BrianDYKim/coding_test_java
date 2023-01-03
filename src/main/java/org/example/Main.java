package org.example;

import org.example.year2023.jan.day3.JM119First;
import org.example.year2023.jan.day3.JM119Second;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {-7, 4, -3, 6, 3, -8, 3, 4};

        int result = JM119Second.fastestSum(intArray);

        System.out.println(result);
    }
}