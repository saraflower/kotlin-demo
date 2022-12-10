package com.saraflower.ktdemo.datatypes

fun main() {
    val int = 10
    var long = 22L

    //long = int will not work automatically, there is no number widening
    long = int.toLong()

    val anotherLong: Long = 5 //Note that literals do get widened automatically, no need to specify the 'L'

    val byte: Byte = 111
    val short: Short = byte.toShort() // same here

    val float = 25.25f
    val double: Double = float.toDouble()

    val char = 'b'
    //This won't work, chars are treated as chars
    //val char2: Char = 65
    val myCharInt = 65
    val converted: Char = myCharInt.toChar() //same thing

    //Will not work either
    //val notBoolean: Boolean = 1
    val boolean = true
}