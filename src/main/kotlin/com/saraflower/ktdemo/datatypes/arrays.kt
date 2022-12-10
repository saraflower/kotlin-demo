package com.saraflower.ktdemo.datatypes

import java.math.BigDecimal

fun main() {
    val names = arrayOf("Sara", "Abel", "Lynn")

    val longs1 = arrayOf(1L, 2L, 3L) //Long array
    val longs2 = arrayOf<Long>(1, 2, 3, 4) //Long array
    val ints1 = arrayOf(1L, 2L, 3L) //Int array

    println(longs1[2])

    val evenNumbers = Array(16) { i -> i * 2 }

    evenNumbers.forEach { int -> println(int) }

    val lotsOfNumbers = Array(100000) { i -> i + 1 }

    val allZeros = Array(100) { 0 }//You can do: .toIntArray()

    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    mixedArray.forEach { element -> println(element) }

    //primitive array classes, more performant, also needed to call java code which needs arrays of primitives
    val primitiveInt: IntArray = intArrayOf(1, 2, 3)//To kotlin array: .toTypedArray()
    val primitiveInt2 = IntArray(5) //Does not need values to be initialized as it initializes to default primitive
}