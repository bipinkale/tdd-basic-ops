package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class FibonacciTest {
    @ParameterizedTest
    @CsvSource(value = ["0,0", "1,1", "2,1", "3,2", "4,3", "5,5", "6,8", "7,13", "8,21", "9,34", "10,55", "11,89", "12,144"])
    fun assertRecursiveFibonacci(index: Int, fibonacciNum: Int) {
        assertEquals(fibonacciNum, recFibonacci(index))
    }

    @ParameterizedTest
    @CsvSource(value = ["0,0", "1,1", "2,1", "3,2", "4,3", "5,5", "6,8", "7,13", "8,21", "9,34", "10,55", "11,89", "12,144"])
    fun assertIterativeFibonacci(index: Int, fibonacciNum: Int) {
        assertEquals(fibonacciNum, itFibonacci(index))
    }
}