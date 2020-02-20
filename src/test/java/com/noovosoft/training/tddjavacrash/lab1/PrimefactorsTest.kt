package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class NumberAndPrimeFactors(val primeFactors: List<Int>, val num: Int)

class PrimeFactorsTest {
    @ParameterizedTest
    @MethodSource("numbersAndPrimeFactors")
    fun assertPrimeFactors(input: NumberAndPrimeFactors) {
        assertEquals(input.primeFactors, primeFactors(input.num))
    }

    @Test
    fun `primeFactors should return empty list for 1`() {
        assertEquals(emptyList(), primeFactors(1))
    }

    companion object {
        @JvmStatic
        fun numbersAndPrimeFactors() = listOf(
                NumberAndPrimeFactors(listOf(2), 2),
                NumberAndPrimeFactors(listOf(3), 3),
                NumberAndPrimeFactors(listOf(2, 2), 4),
                NumberAndPrimeFactors(listOf(2, 2, 2), 8),
                NumberAndPrimeFactors(listOf(3, 3, 3), 27),
                NumberAndPrimeFactors(listOf(2, 3, 5), 30),
                NumberAndPrimeFactors(listOf(2, 2, 3, 3), 36),
                NumberAndPrimeFactors(listOf(2, 2, 3, 3, 5, 5), 900))
    }
}