package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {

        // Create simple list of integers
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 10, 7, 5, 3, 6, 6, 13, 0));

        // Find all pairs that sum up to 13 and sort them in ascending order
        List<String> pairsSumTo13 = findPairsSumTo13(integerList);

        // Print the result
        System.out.println("Pairs:");
        for (String pair : pairsSumTo13) {
            System.out.println(pair);

        }


    }

    private static List<String> findPairsSumTo13(List<Integer> integerList) {
        List<String> pairsSumTo13 = new ArrayList<>();


        for (int i = 0; i < integerList.size(); i++) {
            int number1 = integerList.get(i);
            for (int j = i; j < integerList.size(); j++) {
                int number2 = integerList.get(j);

                if (number1 + number2 == 13) {
                    pairsSumTo13.add(Math.min(number1, number2) + " " + Math.max(number1, number2));
                }
            }
        }

        pairsSumTo13.sort((pair1, pair2) -> {
            String[] pair1Numbers = pair1.split(" ");
            String[] pair2Numbers = pair2.split(" ");
            int number1Pair1 = Integer.parseInt(pair1Numbers[0]);
            int number2Pair1 = Integer.parseInt(pair1Numbers[1]);
            int number1Pair2 = Integer.parseInt(pair2Numbers[0]);
            int number2Pair2 = Integer.parseInt(pair2Numbers[1]);

            if (number1Pair1 == number1Pair2) {
                return Integer.compare(number2Pair1, number2Pair2);
            } else {
                return Integer.compare(number1Pair1, number1Pair2);
            }
        });
        return pairsSumTo13;

    }

}
