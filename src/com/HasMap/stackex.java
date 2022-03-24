package com.HasMap;

import java.util.Stack;

public class stackex {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        System.out.println(s);

        // remove the top
        System.out.println(s.pop());
        System.out.println(s);

        //return the top
        System.out.println(s.peek());
        System.out.println(s);

        //return the size
        System.out.println(s.size());

        //return the position from the top
        System.out.println(s.search("A"));
        System.out.println(s.search("Z"));
    }
}
