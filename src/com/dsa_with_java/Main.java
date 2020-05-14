package com.dsa_with_java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //System.out.println("HelloWorld");

        //HashMap
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Joey");
        map.put(2,"Kunju");
        var value=map.get(1);
        System.out.println(value);
        for(var item:map.entrySet())
            System.out.println(item);
        for(var item:map.keySet())
            System.out.println(item);
//        System.out.println(map.containsKey(2));
//        System.out.println(map.containsValue("Joey"));
     //A green Apple
        HashTableExercises ht = new HashTableExercises();
        System.out.println(ht.findOftRepeatedChar("A green Apple"));
        System.out.println(ht.firstNonRepeating("A green Apple"));
        System.out.println(ht.firstRepeatedChar("A green Apple"));
        System.out.println(ht.firstRepeatedChar("green Apple"));
        System.out.println(ht.firstRepeatWithSet("green Apple"));

        //Set Removes duplicate entries
        Set<Integer> set = new HashSet<>();
        int[]nums={1,2,2,3,3,4,5,6};
        for(var num:nums){
            set.add(num);

        }
        System.out.println(set);


        HashTable m = new HashTable();
        System.out.println(m.fibonacci(10));


    }
}
