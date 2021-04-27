package com.example.number1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class MyDataStructure {
    ArrayList<Integer> arr;   // დინამიური ლისტი

    // HashMap სადაც key არის მასივის ელემენტები, ხოლო value მასივის ინდექსები
    HashMap<Integer, Integer> hash;

    // კონსტრუქტორი რომელიც ქმნის arr მასივს და hash map_ს
    public MyDataStructure() {
        arr = new ArrayList<>();
        hash = new HashMap<>();
    }

    // O(1) ფუნქცია, რომელიც ამატებს ელემენტს ჩვენ მონაცემთა სტრუქტურაში
    void add(int x) {
        // თუ ელემენტი არსებობს, მაშინ არაფერია გასაკეთებელი და გადის ფუნქციიდან
        if (hash.get(x) != null)
            return;

        // თუ არ არსებობს ელემენტი, მაშინ ელემენტს ამატებს მასივის ბოლოს
        int s = arr.size();
        arr.add(x);

        // hash map_ში ამატებს ელემენტს და თავის ინდექსს
        hash.put(x, s);
    }

    // O(1) ფუნქცია, რომელიც შლის ელემენტს ჩვენი მონაცემთა სტრუქტურიდან
    void remove(int x) {
        // თუ ელემენტი არ არსებობს, მაშინ არაფერია გასაკეთებელი და გადის ფუნქციიდან
        Integer index = hash.get(x);
        if (index == null)
            return;

        // თუ არსებობს ელემენტი, მაშინ შლის ელემენტს hash map_დან
        hash.remove(x);

        // შეცვლის მოცემულ ელემენტისა და ბოლო ელემენტის ადგილები arr[] მასივში იმისათვის,
        // რომ ელემენტის წაშლა მოხდეს O(1) დროში
        int size = arr.size();
        Integer last = arr.get(size - 1);
        Collections.swap(arr, index, size - 1);

        // შლის მასივის ბოლო ელემენტს, რომელიც ხდება O(1) დროში
        arr.remove(size - 1);

        // დააბდეითებს hash map_ს ბოლო ელემენტის ახალი ინდექსისათვის
        hash.put(last, index);
    }
}
