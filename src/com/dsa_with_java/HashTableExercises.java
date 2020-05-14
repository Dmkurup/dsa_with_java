package com.dsa_with_java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {
    public char findOftRepeatedChar(String str) {
        //A green Apple
        Map<Character, Integer> map = new HashMap<>();

        for (char item : str.toCharArray()) {
            int count = map.getOrDefault(item, 0);
            map.put(item, count + 1);
        }
        int max = 0;
        char result = 0;
        for (var item : map.entrySet()) {
            if (item.getValue() > max) {
                max = item.getValue();
                result = item.getKey();
            }
        }
        return result;
    }

    public char firstNonRepeating(String str){
        Map<Character,Integer>map = new HashMap<>();
        for (var ch:str.toCharArray()){
            var count = map.containsKey(ch)?map.get(ch):0;
            map.put(ch,count+1);
        }
        for(var ch:str.toCharArray()){
            if(map.get(ch)==1){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }

    public char firstRepeatedChar(String str){
        Map<Character,Integer> map = new HashMap<>();
        for(var ch:str.toCharArray()){
           int count = map.getOrDefault(ch,0);
           map.put(ch,count+1);
        }
        System.out.println(map);
        //{ =2, p=2, A=2, r=1, e=3, g=1, l=1, n=1}
        for(var ch:str.toCharArray()){
            if(map.get(ch)>1){
                return ch;
            }
        }
        return Character.MIN_VALUE;
    }
    public char firstRepeatWithSet(String str){
        Set<Character>set =new HashSet<>();
        for(var ch:str.toCharArray()){
            if(set.contains(ch)){
                return ch;
            }
            set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
