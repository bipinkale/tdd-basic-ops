package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertTrue

class PythagoreanTest {
    @ParameterizedTest
    @CsvSource(value = ["3, 4, 5", "6, 8,10", "5, 12, 13",
        "9, 12, 15", "8, 15, 17", "12, 16, 20",
        "15, 20, 25", "7, 24, 25", "10, 24, 26",
        "20, 21, 29", "18, 24, 30", "16, 30, 34",
        "21, 28, 35"])
    fun assertIsTriplet(firstNum: Int, secondNum: Int, thirdNum: Int) {
        assertTrue(isTriplet(firstNum, secondNum, thirdNum))
    }

    @ParameterizedTest
    @CsvSource(value = ["0, 0, 0", "-6, 8,-10", "-5, -12, -13",
        "9, -12, -15", "8, 15, -17", "12, -16, 20",
        "15, -20, 25", "7, 24, 5", "-10, -24, 26",
        "20, 21, 2", "18, 4, -30", "16, -30, -34",
        "21, 2, 35"])
    fun assertIsNotTriplet(firstNum: Int, secondNum: Int, thirdNum: Int) {
        assertTrue(!isTriplet(firstNum, secondNum, thirdNum))
    }
}