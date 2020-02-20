package com.noovosoft.training.tddjavacrash.lab1

fun primeFactors(number: Int): List<Int> {
    val primeFactors = mutableListOf<Int>()
    var divisor = 2
    var num = number
    while (num > 1) {
        if (num % divisor == 0) {
            primeFactors.add(divisor)
            num /= divisor
        } else {
            divisor += if(divisor==2) 1 else 2
        }
    }
    return primeFactors
}