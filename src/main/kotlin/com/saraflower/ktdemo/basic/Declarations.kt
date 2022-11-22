package com.saraflower.ktdemo.basic

fun main() {
    val number = 5
    val number2: Short = 5

    val person1 = Person("Sara", 150)
    person1.name = "Serah"

    var person2: Person
    person2 = Person("Variable person", 300)
    person2 = Person("I changed", 450)
}

class Person(var name: String, val id: Int)