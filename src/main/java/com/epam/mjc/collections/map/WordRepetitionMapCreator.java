package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, sentence.toLowerCase().split("[ ,.]+"));

        Map<String,Integer> hm = new HashMap<>();
        for (String s : arrayList) {
            if (!Objects.equals(s, "")) {
                hm.putIfAbsent(s, Collections.frequency(arrayList, s));
            }
        }

        return hm;
    }
}
