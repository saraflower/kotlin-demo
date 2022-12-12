package com.saraflower.ktdemo.challenges

fun main() {
    val float1 = 3847.384f
    val float2: Float = 3847.384.toFloat()

    val float3: Float? = 3847.384f
    val float4: Float? = 3847.384.toFloat()

    val array1: Array<Short> = Array(5) { i -> (i + 1).toShort() }
    val array2 = shortArrayOf(1, 2, 3, 4, 5)
    array1.forEach { println(it) }

    val array3 = Array<Int?>(40) { i -> (i + 1) * 5 }
    array3.forEach { println(it) }

    val array4 = charArrayOf('a', 'b', 'c')

    val x: String? = "I AM IN LOWERCASE"
    val x2 = x?.lowercase() ?: "I give up!"
    println(x2)

    var x3: String? = "I AM IN UPPERCASE"
    x3 = x3.let { it?.lowercase() }
    x3 = x3.let { it?.replace("am", "am not") }
    println(x3)

    val nonNullVariable: Int? = null
    //nonNullVariable!!.toDouble() //produces NPE
}