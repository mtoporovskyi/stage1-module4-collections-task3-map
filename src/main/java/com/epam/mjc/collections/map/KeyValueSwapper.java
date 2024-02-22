package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> newMap = new HashMap<>();

        for (Map.Entry<Integer, String> e: sourceMap.entrySet()) {
            if (newMap.containsKey(e.getValue())) {
                if (e.getKey() < newMap.get(e.getValue())) {
                    newMap.put(e.getValue(), e.getKey());
                }
            } else {
                newMap.put(e.getValue(), e.getKey());
            }
        }
        return newMap;
    }
}
