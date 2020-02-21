package com.noovosoft.training.tddjavacrash.lab1

fun isTriplet(firstNum: Int, secondNum: Int, thirdNum: Int): Boolean {
    val numbers = listOf(firstNum, secondNum, thirdNum).sorted()
    if (numbers.any { it <= 0 }) return false
    return (numbers[0] * numbers[0] + numbers[1] * numbers[1] == numbers[2] * numbers[2])
}