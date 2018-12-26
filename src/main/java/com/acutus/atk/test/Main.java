package com.acutus.atk.test;

public class Main {

    public static void main(String[] args) {
        com.acutus.atk.test.PersonEntity p = new com.acutus.atk.test.PersonEntity();
        System.out.println(p._name.set("ello").getName());
        System.out.println(p.getFields().getChanged().toString());

    }
}
