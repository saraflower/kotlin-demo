package com.saraflower.ktdemo.basic.declarations

typealias PersonSet = Set<Person>

fun main() {
    val number = 5
    val number2: Short = 5

    val names = arrayListOf("Sara", "Abel")
    println(names[1])

    val normalPersons: Set<Person>
    val persons: PersonSet

    val person1 = Person("Sara", 150)
    person1.name = "Serah"

    var person2: Person
    person2 = Person("Variable person", 300)
    person2 = Person("I changed", 450)

    val something: Any = person1
    val alsoSomething: Person = something as Person

    if(something is Person) {
        println(something.id)
    }

    val change = 4.22
    println("\$ Change is $$change, in $")

    val numerator = 10.99
    val denominator = 20.00

    println("""
        Value of $numerator 
        divided by $denominator 
        is ${numerator/denominator}"""
        .trimIndent()
    )

    println(person1)

    val filePath = """C:\somedir\somedir2"""
}

class Person(var name: String, val id: Int) {
    override fun toString(): String {
        return "${javaClass.simpleName}(name=$name, id=$id)"
    }
}