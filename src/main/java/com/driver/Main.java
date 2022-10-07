package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly r = new RWOnly();
       // r.name="Azizul"; //----> this is not possible bcz name var is private, scope is only the local class
        r.setName("Azizul");
        System.out.println(r.getName());
    }
}