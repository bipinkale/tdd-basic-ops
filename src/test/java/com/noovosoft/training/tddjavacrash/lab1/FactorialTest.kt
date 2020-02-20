package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

class FactorialTest {
    @ParameterizedTest
    @CsvSource(value = ["0,1", "1,1", "2,2", "3,6", "4,24", "5,120", "6,720", "10,3628800"])
    fun assertFactorial(num: Int, factorial: Int) {
        assertEquals(factorial, fact(num))
    }

    @Test
    fun `fact(-1) is Undefined`() {
        assertEquals(Double.NaN.toInt(), fact(-1))
    }
}