package com.capgemini.set;

import java.util.HashSet;

public class ProgramForHash {
    public static void main(String[] args) {


        HashSet<Object> h = new HashSet<>();
        h.add(100);
        h.add(203);
        h.add(4);
        h.add(44);
        h.add(78);
        h.add(54);
        h.add(400);
        System.out.println(h);
    }
}
