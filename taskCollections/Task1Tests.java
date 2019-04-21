package com.dev.java.taskCollections;

import java.util.*;

public class Task1Tests {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> listAllItems = new ArrayList<String>();

        System.out.println("Enter some word...");

        while (sc.hasNextLine()) {

            String userInput = sc.nextLine();

            if (userInput.equals("koniec")) {
                System.out.println("The program ended with " +
                        "the introduction of the word \"koniec\"");
                break;
            }else {
                listAllItems.add(userInput);
            }
            System.out.println("Enter some word...");
        }

        System.out.println("Entered are "+listAllItems.size()+" items");
        Set<String> listUniqueItems = new HashSet<String>(listAllItems);
        System.out.println("Entered are "+listUniqueItems.size()+" unique items");
    }
}

