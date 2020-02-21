package com.noovosoft.training.tddjavacrash.lab1

fun fact(number: Int): Int {
    if (number < 0) return Double.NaN.toInt() else if (number == 0) return 1
    var factorial = 1
    (1..number).forEach { factorial *= it }
    return factorial
}