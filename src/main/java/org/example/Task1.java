package org.example;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        // Simple integerList
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(10);
        integerList.add(20);
        integerList.add(20);
        integerList.add(2);
        integerList.add(5);

        // Get the distinct elements sorted in ascending order
        List <Integer> sortredElements = getSortedElements(integerList);

        // Basic measurement information
        int numELementSource = integerList.size();
        int numSortedElements = sortredElements.size();
        int minValue = sortredElements.get(0);
        int maxValue = sortredElements.get(sortredElements.size()-1);

        //Print the results
        System.out.println(sortredElements);
        System.out.println("count:" + numELementSource);
        System.out.println("distinc:" + numSortedElements);
        System.out.println("min:" + minValue);
        System.out.println("max:" + maxValue);


    }

    private static List<Integer> getSortedElements(List<Integer> integerList) {
        Set<Integer> sortedElementsSet = new HashSet<>(integerList);
        List <Integer> sortedElements = new ArrayList<>(sortedElementsSet);
        Collections.sort(sortedElements);
        return sortedElements;

    }
}