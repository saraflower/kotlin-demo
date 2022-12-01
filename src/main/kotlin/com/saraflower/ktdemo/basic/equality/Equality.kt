package com.saraflower.ktdemo.basic.equality

import java.util.Objects

typealias PersonSet = Set<Person>

fun main() {
    val person1 = Person("name1", 0)
    val person2 = Person("name2", 1)
    val person3 = Person("name2", 1)

    //All checks are structural, no referential equality as in java
    println(person1 == person2)
    println(person2 == person3)
    println(person1.equals(person2))
    println(person2.equals(person3))

    //For referential equality instead do:
    println(person1 === person2)
    println(person2 === person3)

    //Always true as we're just storing the pointer to the instance
    val person4 = person2
    println(person4 === person2)

    //Not equals examples
    println(person4 != person2)
    println(person4 !== person2)
    println(person2 != person3)
    println(person2 !== person3)
}

class Person(var name: String, val id: Int) {
    override fun equals(obj: Any?): Boolean {
        if(obj is Person) {
            return name == obj.name && id == obj.id
        }

        return false
    }
}