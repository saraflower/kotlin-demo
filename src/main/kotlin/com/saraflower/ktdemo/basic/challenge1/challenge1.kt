package com.saraflower.ktdemo.basic.challenge1

fun main() {
    val hello1 = "Hello"
    val hello2 = "Hello"

    println(hello1 === hello2)

    println(hello1 == hello2)

    var number = 2988

    val imn: Any = "Any = root of kotlin class hierarchy"

    if(imn is String) {
        println(imn.uppercase())
    }

    println("""
        |   1
        |  11
        | 111
        |1111
    """.trimMargin())
}