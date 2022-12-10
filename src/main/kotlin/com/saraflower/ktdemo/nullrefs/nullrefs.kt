package com.saraflower.ktdemo.nullrefs

fun main() {
    //Not working
    //Not nullable
    //val str1: String = null

    //Nullable
    val str2: String? = null

    //Not working because it's nullable, therefore not safe
    //str2.uppercase()

    //If we check for null however...
    if(str2 != null) str2.uppercase()

    //Another way to check for null, safe call operator
    str2?.uppercase()

    //What if it's null?
    //Just evaluates to null, no NPE, otherwise runs fine
    println(str2?.uppercase())

    //Equals to
    if(str2 == null) {
        null
    } else {
        str2.uppercase()
    }

    //Elvis operator lets you assign a default value when expression evaluates to null
    val str3 = str2 ?: "Default value :)"

    val something: Any = 5
    val int = something as? Int //Will be cast safely
    println(int)

    val something2: Any = 5L
    val int2 = something2 as? Int //Because it's a safe cast and it would always fail, it will always evaluate to null
    println(int2)
}