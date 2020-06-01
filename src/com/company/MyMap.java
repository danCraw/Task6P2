package com.company;


import java.util.Map;

public interface MyMap<K, V> {
    void put(K key, V value);
    V get(K key);
    void countMeeting(K key);
    Map getAll();
}