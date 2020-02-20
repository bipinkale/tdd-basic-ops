package com.noovosoft.training.tddjavacrash.lab1

fun recFibonacci(number: Int): Int {
    return (1..number).fold(Pair(0, 1)) { (current, next), _ -> Pair(next, next + current) }.first
}

fun itFibonacci(number: Int): Int {
   return when (number) {
        0 -> 0
        1 -> 1
        else -> itFibonacci(number - 1) + itFibonacci(number - 2)
    }
}