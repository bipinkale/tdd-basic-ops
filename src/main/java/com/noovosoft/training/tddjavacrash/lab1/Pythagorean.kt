package com.noovosoft.training.tddjavacrash.lab1

fun isTriplet(firstNum: Int, secondNum: Int, thirdNum: Int): Boolean {
    val numbers = listOf(firstNum, secondNum, thirdNum).sorted()
    return (numbers[0].toBigDecimal().pow(2) + numbers[1].toBigDecimal().pow(2) == numbers[2].toBigDecimal().pow(2))
}