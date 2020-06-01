package com.company;

import java.util.Map;

public class MyCounter {


    public  static Map countMeeting(String text){
        MyMap<String, Integer> myMap = new MyMapImplements<>();
        for (String word : text.replaceAll("[^A-Za-zА-Яа-яЁё ]", "").split(" ")) {
            if (word.length() > 1) {
                if (word.substring(0, 1).toUpperCase().equals(word.substring(0, 1)) && !(word.substring(0, 2).toUpperCase().equals(word.substring(0, 2)))) {
                    myMap.countMeeting(word);
                }
            }
        }
        return myMap.getAll();
    }
}
