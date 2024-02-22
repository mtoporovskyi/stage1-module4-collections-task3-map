package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        boolean isValuePresent = false;
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

        for (Map.Entry<Integer, Integer> e: functionMap.entrySet()) {
            if (e.getValue() == requiredValue) {
                isValuePresent = true;
                break;
            }
        }
        return isValuePresent;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> newMap = new HashMap<>();

        for (int num: sourceList) {
            newMap.put(num, num * 5 + 2);
        }

        return newMap;
    }
}
