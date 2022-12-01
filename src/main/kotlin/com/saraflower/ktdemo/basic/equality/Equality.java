package com.saraflower.ktdemo.basic.equality;

public class Equality {
    public static void main(String[] args) {
        ClassPerson person1 = new ClassPerson(0, "name1");
        ClassPerson person2 = new ClassPerson(1, "name2");
        ClassPerson person3 = new ClassPerson(1, "name2");

        //Referential equality, checks if it's the same instance
        System.out.println(person1 == person2);
        System.out.println(person2 == person3);

        //Uses the implemented equals
        System.out.println(person1.equals(person2));
        System.out.println(person2.equals(person3));
    }
}
