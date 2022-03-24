package com.HasMap;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        String name="Monika Pun ";

        char[] chars = name.toCharArray();

        Map<Character,Integer> nameMap = new HashMap<>();

        for(char c :chars){

            if(nameMap.containsKey(c)){
                nameMap.put(c,nameMap.get(c)+1);
            }else{
                nameMap.put(c,1);
            }
        }

        System.out.println(nameMap);
    }

}