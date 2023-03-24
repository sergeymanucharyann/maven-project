package com.bdg.java_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListAndLInkedList {
    /**
     * This is a simple program which prints element of ArrayList twice
     */
    public void ArrayListIteration() {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("kiwi");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    /**
     * This is a simple program which add element in ArrayList
     */
    public void addArrayElement() {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("black");
        colors.add("green");
        colors.add("blue");

        colors.add(0, "orange");

        System.out.println(colors);
    }

    public void UpdateArrayElement() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("mers");
        fruits.add("bmw");
        fruits.add("lada");
        fruits.add("kia");

        System.out.println("Original ArrayList: " + fruits);

        fruits.set(1, "toyota");

        System.out.println("Updated ArrayList: " + fruits);
    }

    public boolean SearchElementInArrayList() {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("orange");

        return colors.contains("green");
    }


    public void moveElements(ArrayList<String> colors) {

        ArrayList<String> colors2 = new ArrayList<>();

        colors2.addAll(colors);

        System.out.println("colors1: " + colors);
        System.out.println("colors2: " + colors2);
    }

    public void reserveArray(ArrayList<String> colors) {
        System.out.println("Original ArrayList: " + colors);
        Collections.reverse(colors);
        System.out.println("Reversed ArrayList: " + colors);
    }

    public void swapArrayListElements(ArrayList<String> colors) {
        System.out.println("Original ArrayList: " + colors);
        Collections.swap(colors, 1, 3);
        System.out.println("Swapped ArrayList: " + colors);
    }

    public void testArrayList(ArrayList<String> colors) {

        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println(colors);
        }
    }

    public void increaseArrayListSizeExample() {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        System.out.println("Original ArrayList: " + colors);

        colors.add("black");
        colors.add("white");

        System.out.println("Increased ArrayList : " + colors);
    }

    public void iterateLinkedList() {
        LinkedList<String> colors = new LinkedList<>();

        Iterator iterator = colors.iterator();

        while (iterator.hasNext()) {
            String color = (String) iterator.next();
            System.out.println(color);
        }
    }


}


