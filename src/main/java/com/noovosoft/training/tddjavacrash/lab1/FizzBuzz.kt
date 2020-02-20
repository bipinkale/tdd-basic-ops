package com.noovosoft.training.tddjavacrash.lab1

fun fizzBuzz(vararg numbers: Int): List<String> {
    val fizzsAndBuzzs = mutableListOf<String>()
    var output = ""
    numbers.forEach { n ->
        if (n % 3 == 0) output = "Fizz"
        if (n % 5 == 0) output += "Buzz"
        if (output.isEmpty()) output = n.toString()
        fizzsAndBuzzs.add(output)
        output = ""
    }
    return fizzsAndBuzzs
}