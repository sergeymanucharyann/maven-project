package com.bdg.java_collections;

import java.util.*;

public class ArrayListHomework {
    /**
     * Exercise 1
     * This is a simple program which prints element of ArrayList twice
     *
     * @param myList ArrayList
     */
    public void arrayListIteration(ArrayList<String> myList) {

    }

    /**
     * Exercise 2
     * This is a simple program which add element in ArrayList
     *
     * @param colors ArrayList
     * @return ArrayList
     */
    public ArrayList<String> addArrayElement(ArrayList<String> colors) {
        colors.add(0, "orange");
        return colors;
    }


    /**
     * Exercise 3
     *
     * @param ints  ArrayList<Integer>
     * @param index int
     * @param value int
     * @return int
     */
    public ArrayList<Integer> update(ArrayList<Integer> ints, int index, int value) {
        ints.set(index, value);
        return ints;
    }

    /**
     * Exercise 4
     *
     * @param colors  ArrayList<String>
     * @param contain String
     * @return boolean
     */
    public boolean search(ArrayList<String> colors, String contain) {
        return colors.contains(contain);
    }

    /**
     * Exercise 5
     *
     * @param colors ArrayList<String>
     * @return ArrayList<String>
     */
    public ArrayList<String> moveElements(ArrayList<String> colors) {

        ArrayList<String> colors2 = new ArrayList<>();

        colors2.addAll(colors);

        return colors2;
    }

    /**
     * Exercise 6
     *
     * @param colors ArrayList<String>
     * @return ArrayList
     */
    public ArrayList<String> reserveArray(ArrayList<String> colors) {
        Collections.reverse(colors);
        return colors;
    }

    /**
     * Exercise 7
     *
     * @param colors ArrayList<String>
     * @return ArrayList
     */
    public ArrayList<String> swapArrayListElements(ArrayList<String> colors) {
        Collections.swap(colors, 1, 3);
        return colors;
    }

    /**
     * Exercise 8
     *
     * @param colors ArrayList<String>
     * @return colors
     */
    public ArrayList<String> isEmpty(ArrayList<String> colors) {

        if (colors.isEmpty()) {
            return null;
        } else {
            return colors;
        }
    }

    /**
     * Exercise 9
     *
     * @param colors ArrayList<String>
     * @param increaseElements ArrayList<String>
     * @return colors List
     */
    public ArrayList<String> increaseArrayListSize(ArrayList<String> colors, ArrayList<String> increaseElements) {
        colors.add(String.valueOf(increaseElements));
        return colors;
    }
}


