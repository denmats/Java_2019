package com.dev.java.tasksBigInteger;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Task1Tests {
    // Assigment:
    // 4. Podaj, ile liczb w pliku liczby.txt jest podzielnych przez 2 oraz ile liczb jest podzielnych przez 8.(endWidth)
    //5. Znajdź najmniejszą i największą liczbę w pliku liczby.txt.
    // Jako odpowiedź podaj numery wierszy, w których się one znajdują.


    public static int counter2 = 0;
    public static int counter8 = 0;

    public static void main(String[] args) {

        List<String> listAllItems = new ArrayList<>();


        //Read data from text file and add each line to ArrayList
        try (BufferedReader br = new BufferedReader(new FileReader("liczby.txt"))) {
            String line = br.readLine();
            while (line != null) {
                listAllItems.add(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Something went wrong...");
        }

        //Find how many numbers in file liczby.txt are divided by 2 and divided by 8
        for (int i = 0; i < listAllItems.size(); i++) {
            String tmp = listAllItems.get(i);
            BigInteger bi = new BigInteger(tmp, 2);
            BigInteger bi2 = bi.mod(BigInteger.valueOf(2));
            if (bi2.intValue() == 0) {
                counter2++;
            }
            BigInteger bi8 = bi.mod(BigInteger.valueOf(8));
            if (bi8.intValue() == 0) {
                counter8++;
            }
        }
        System.out.println("There are " + counter2 + " numbers in file liczby.txt divided by 2");
        System.out.println("There are " + counter8 + " numbers in file liczby.txt divided by 8");

        //Get max number from liczby.txt
        BigInteger maxBi = BigInteger.ZERO;
        for (int i = 0; i < listAllItems.size(); i++) {
            String tmp = listAllItems.get(i);
            BigInteger bi = new BigInteger(tmp);
            maxBi = (bi.max(maxBi));
        }
        System.out.println("The maximum number is " + maxBi);

        //Get min number from liczby.txt
        BigInteger minBi = maxBi;
        for (int i = 0; i < listAllItems.size(); i++) {
            String tmp = listAllItems.get(i);
            BigInteger bi = new BigInteger(tmp);
            minBi = (bi.min(minBi));
        }
        System.out.println("The minimum number is " + minBi);

        String maxStr =maxBi.toString();
        String minStr =minBi.toString();
        for(String it: listAllItems ){
            if(maxStr == it){
                System.out.println(it);
            }
            if (minStr == it) {
                System.out.println(it);
            }
        }
    }
}
