package com.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Atm {

    public static void main(String[] args) {
          //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
          String string = "ABCDEFGAHIJKLMNOP";
          System.out.println(findLongest(string));
    }

    private static String findLongest(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> longestStringList = new LinkedList<>();
        HashMap<Character, Integer > hashMap = new HashMap<>();
        for(int i = 0; i < string.length(); i++) {
            if(hashMap.containsKey(string.charAt(i))) {
                hashMap.put(string.charAt(i), hashMap.get(string.charAt(i)) + 1);
            } else {
                hashMap.put(string.charAt(i), 1);
            }
        }
        int length = string.length();
        for(int i = 0; i < length; i++) {

            if(!hashMap.containsKey(string.charAt(i)) && i != length - 1 ) {
                longestStringList.add(stringBuilder.toString());
                stringBuilder = new StringBuilder();
                stringBuilder.append(string.charAt(i));
            } else {
                stringBuilder.append(string.charAt(i));
                hashMap.remove(string.charAt(i));
            }
        }

        System.out.println("StringBuilder "+ stringBuilder.toString());

        longestStringList.add(stringBuilder.toString());

        List<String> longerString = longestStringList.stream()
            .sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
         return longerString.get(0);
    }



}
