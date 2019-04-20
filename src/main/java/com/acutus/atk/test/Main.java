package com.acutus.atk.test;

import com.acutus.atk.reflection.Reflect;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        com.acutus.atk.test.PersonEntity p = new com.acutus.atk.test.PersonEntity();
        System.out.println(p._name.set("ello").getName());
        System.out.println(p.getFields().getChanged().toString());

        Field field1 = Reflect.getFields(Tester.class).getByName("name").get();
        Field field2 = Reflect.getFields(Tester.class).getByName("name").get();
        System.out.println(field1 + " " + field2);
//

        long mem = Runtime.getRuntime().freeMemory();
        System.out.println(mem);
        List<com.acutus.atk.test.PersonEntity> values = new ArrayList<>();
        int cnt = 100000;
        for (int i = 0; i < cnt; i++) {
            values.add(new com.acutus.atk.test.PersonEntity());
        }
        mem = mem - Runtime.getRuntime().freeMemory();
        System.out.println("used = " + mem / 1024.0 / 1024.0 + " per record " + mem / 100000);
    }

    public static class Tester {
        String name;
    }
}
