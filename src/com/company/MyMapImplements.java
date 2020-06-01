package com.company;

import java.util.*;

public class  MyMapImplements<K, V> implements MyMap<K, V> {
    public  static  ArrayList out = new ArrayList();
    public  static  String  outStr;
    private LinkedList<Object> linkedListWithKeys = new LinkedList<>();
    private LinkedList<Object> linkedListWithValues = new LinkedList<>();

    @Override
    public void put(K key, V value) {
        boolean uniqueness = true;
        if (linkedListWithKeys.size() != 0) {
            for (int i = 0; i < linkedListWithKeys.size(); i++) {
                if (linkedListWithKeys.get(i).equals(key)) {
                    linkedListWithValues.set(i, value);
                    uniqueness = false;
                }
                if (uniqueness) {
                    linkedListWithKeys.add(key);
                    linkedListWithValues.add(value);
                }
            }
        } else {
            linkedListWithKeys.add(key);
            linkedListWithValues.add(value);
        }
    }

    @Override
    public V get(K key) {
        int i;
        for (i = 0; i < linkedListWithKeys.size(); i++) {
            if (linkedListWithKeys.get(i) == key) {
                break;
            }
        }
        for (int j = 0; j < linkedListWithValues.size(); j++) {
            if (i == j) {
                return (V) linkedListWithValues.get(j);
            }
        }
        return null;
    }

    @Override
    public void countMeeting(K key) {
        boolean uniqueness = true;
        if (linkedListWithKeys.size() != 0) {
            for (int i = 0; i < linkedListWithKeys.size(); i++) {
                if (linkedListWithKeys.get(i).equals(key)) {
                    uniqueness = false;
                    linkedListWithValues.set(i, ((int)linkedListWithValues.get(i) + 1));
                }
            }
        }
        if (uniqueness) {
            linkedListWithKeys.add(key);
            linkedListWithValues.add(1);
        }
    }

    @Override
    public Map getAll() {
        out.add("{");
        outStr = "{";
        for (int i = 0; i < linkedListWithKeys.size(); i++) {
            outStr = outStr + (linkedListWithKeys.get(i) + "=");
            out.add(linkedListWithKeys.get(i) + "=");
            if (i == linkedListWithKeys.size() - 1) {
                outStr = outStr + (linkedListWithValues.get(i));
                out.add(linkedListWithValues.get(i));
            } else {
                out.add(linkedListWithValues.get(i) + ", ");
                outStr = outStr + (linkedListWithValues.get(i) + ", ");
            }
        }
        out.add("}");
        outStr = outStr + ("}");
        return null;
    }

}

