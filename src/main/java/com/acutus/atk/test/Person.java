package com.acutus.atk.test;

import com.acutus.atk.entity.processor.AtkEntity;

@AtkEntity
public class Person {

    @TestFieldAno("hello")
    private String name;

}
