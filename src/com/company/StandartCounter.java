package com.company;

import java.util.Map;
import java.util.TreeMap;

public class StandartCounter {

    public static String strOutStandart = "";

    public static Map countMeeting(String text) {
        Map<String, Integer> wordToCount = new TreeMap<>();
        for (String word : text.replaceAll("[^A-Za-zА-Яа-я ]", "").split(" ")) {
            if (word.length() > 1) {
                if (word.substring(0, 1).toUpperCase().equals(word.substring(0, 1)) && !(word.substring(0, 2).toUpperCase().equals(word.substring(0, 2)))) {
                    wordToCount.put(word, wordToCount.getOrDefault(word, 0) + 1);
                }
            }
        }
        strOutStandart = String.valueOf(wordToCount);
        return wordToCount;
    }
}
