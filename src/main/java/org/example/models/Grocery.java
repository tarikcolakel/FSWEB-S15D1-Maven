package org.example.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();

    public static void addItems(String items) {
        String[] itemArray = items.split(",");
        for (String item : itemArray) {
            if (!groceryList.contains(item.trim())) {
                groceryList.add(item.trim());
            }
        }
        Collections.sort(groceryList);
    }

    public static void removeItems(String items) {
        String[] itemArray = items.split(",");
        for (String item : itemArray) {
            groceryList.remove(item.trim());
        }
        Collections.sort(groceryList);
    }

    public static void printSorted() {
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}