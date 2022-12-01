package com.saraflower.ktdemo.basic.declarations;

import java.util.Arrays;
import java.util.Set;

public class Declarations {
    public static void main(String[] args) {
        final var number = 5;
        final short number2 = 5;

        var names = Arrays.asList("Sara", "Abel");
        System.out.println(names.get(1));

        final Set<Person> normalPersons;
        final Set<Person> persons;

        final var person1 = new JavaPerson("Sara", 150);
        person1.name = "Serah";

        JavaPerson person2 = new JavaPerson("Variable person", 300);
        person2 = new JavaPerson("I changed", 450);
    }
}

class JavaPerson {
    public String name;
    public Integer id;

    public JavaPerson(
            String name,
            Integer id
    ) {
        this.name = name;
        this.id = id;
    }
}