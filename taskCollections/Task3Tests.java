package com.dev.java.taskCollections;

import java.util.*;

public class Task3Tests {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc1 = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> listAllItems = new ArrayList<>();

        System.out.println("Enter some word...");

        while (sc.hasNextLine()) {

            String userInput = sc.nextLine();

            if (userInput.equals("koniec")) {
                System.out.println("The program ended with " +
                        "the introduction of the word \"koniec\"");
                break;
            } else {
                listAllItems.add(userInput);
                if (!(listAllItems.size() < 2)) {
                    for (int i = 0; i < listAllItems.size() - 1; i++) {
                        if (userInput.equals(listAllItems.get(i))) {
                            System.out.print("już jest, czy mam dodać ? tak/nie ");
                            String userChoice = sc1.nextLine();
                            if (!userChoice.equals("tak")) {
                                listAllItems.remove(userInput);
                            }
                        }
                    }
                }
            }
            System.out.println("Enter some word...");
        }

        System.out.println("Entered are " + listAllItems.size() + " items");
        Set<String> listUniqueItems = new HashSet<>(listAllItems);
        System.out.println("Entered are " + listUniqueItems.size() + " unique items");
    }
}
