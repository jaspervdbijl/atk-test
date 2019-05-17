package com.acutus.atk.test;

import com.acutus.atk.entity.processor.Atk;

@Atk
public class Person extends Human {

    @TestFieldAno("hello")
    private String name;

    public String tester() {
        return name;
    }

}
