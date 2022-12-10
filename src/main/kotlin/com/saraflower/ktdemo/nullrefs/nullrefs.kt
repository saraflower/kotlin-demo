package com.saraflower.ktdemo.nullrefs

import kotlin.NullPointerException

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

    //Non null assertion, will throw EXCEPTION if str4 is null
    val str4: String? = "This isn't null"
    //Do NOT concatenate multiple non null assertions in one line, as the exception won't tell you which one failed
    val str5 = str4!!.uppercase()

    //Equals to
    if(str4 == null) {
        throw NullPointerException()
    } else {
        str4.uppercase()
    }

    val str6: String? = "Not null"

    //This won't work because nullable String is a different type other than String
    //printText(str6) compailer complains type mismatch

    //If str isn't null "let it through"
    str6?.let { printText(it) } //Shorthand
    str6?.let { x -> println(x) }

    println(str6 == "something") //Works because == is a safe operator, only evaluates if not null
}

fun printText(text: String) {
    println(text)
}