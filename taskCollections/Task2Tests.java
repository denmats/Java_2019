package com.dev.java.taskCollections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2Tests {

    public static void main(String[] args) {
        //Initialize two collections ArrayList and HashSet
        List<String> listAllItems = new ArrayList<>();
        Set<String> listRepeatedItems = new HashSet<>();

        //Read data from text file and add each line to ArrayList
       try(BufferedReader br = new BufferedReader(new FileReader("napis.txt"))){
           String line = br.readLine();
           while (line != null){
               listAllItems.add(line);
               line = br.readLine();
           }
       }catch (FileNotFoundException e){
           System.out.println("File not found");
       }catch (IOException e){
           System.out.println("Something went wrong...");
       }

        //Count repeated items in ArrayList
       for(int i = 0; i < listAllItems.size(); i++){
           String tmp = listAllItems.get(i);
           int count = 0;
           for(String item: listAllItems){
               if(tmp.equals(item)){
                   count++;
               }
           }
           //if item appear more than one time in the ArrayList
           //put it in Set
           if(count > 1){
               listRepeatedItems.add(listAllItems.get(i));
           }
       }
            //Display items appeared more than one time in text file
            for(String itemRepeatedMoreThanOne: listRepeatedItems){
                System.out.println(itemRepeatedMoreThanOne);
            }
    }
}
