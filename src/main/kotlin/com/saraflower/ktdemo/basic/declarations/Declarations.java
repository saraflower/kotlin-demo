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

        final Object something = person1;
        final JavaPerson alsoSomething = (JavaPerson) something;

        if(something instanceof JavaPerson) {
            System.out.println(((JavaPerson) something).id);
        }

        final var change = 4.22;
        System.out.printf(
                "$ Change is $%s, in $%n", change
        );

        final var numerator = 10.99;
        final var denominator = 20.00;

        System.out.println(
                        "Value of " + numerator + "\n" +
                        "divided by " + denominator + "\n" +
                        "is " + numerator/denominator
        );

        System.out.println(person1);

        final var filePath = "C:\\somedir\\somedir2";
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

    @Override
    public String toString() {
        return String.format(
                "%s(name=%s, id=%s)",
                getClass().getSimpleName(), name, id
        );
    }
}