package com.HasMap;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        String name = "Hello";
        char[] c = name.toCharArray();
        System.out.println(c);

        //Use Stack
        Stack<Character>nameReverse=new Stack<>();
        for (int i=0; i<c.length;i++){
            nameReverse.push(c[i]);
        }
        System.out.println(nameReverse);
        String rev="";
        StringBuilder sb = new StringBuilder();
        while (!nameReverse.isEmpty()){
            Character el =nameReverse.pop();
            //rev = rev+el;
            sb.append(el);
        }
        //System.out.println(rev);
        System.out.println(sb.toString());
        //new String(sb);


    }
    }

