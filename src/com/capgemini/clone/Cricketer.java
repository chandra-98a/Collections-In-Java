package com.capgemini.clone;

public class Cricketer implements Cloneable {
    Object obj;
    String name;

    public Cricketer(String name) {
        this.name = name;
    }

    public Object Clone() {
        try {
            obj = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}