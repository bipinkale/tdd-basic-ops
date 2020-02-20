package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class NumbersAndFizzBuzzs(val fizzsAndBuzzs: List<String>, vararg val numbers: Int)

class FizzBuzzTest {
    @ParameterizedTest
    @MethodSource("numbersAndFizzBuzzs")
    fun assertFizzBuzz(input: NumbersAndFizzBuzzs) {
        assertEquals(input.fizzsAndBuzzs, fizzBuzz(*input.numbers))
    }

    @Test
    fun `fizzBuzz() return empty list for zero param`() {
        assertEquals(emptyList(), fizzBuzz())
    }

    companion object {
        @JvmStatic
        fun numbersAndFizzBuzzs() = listOf(
                NumbersAndFizzBuzzs(listOf("1"), 1),
                NumbersAndFizzBuzzs(listOf("Fizz"), 3),
                NumbersAndFizzBuzzs(listOf("Buzz"), 5),
                NumbersAndFizzBuzzs(listOf("FizzBuzz"), 0),
                NumbersAndFizzBuzzs(listOf("FizzBuzz"), 15),
                NumbersAndFizzBuzzs(listOf("101", "Fizz", "Buzz", "FizzBuzz"), 101, 102, 110, 120),
                NumbersAndFizzBuzzs(listOf("Fizz", "202", "203", "Fizz", "Buzz", "206", "Fizz", "208", "209", "FizzBuzz"),
                        201, 202, 203, 204, 205, 206, 207, 208, 209, 210))
    }
}
