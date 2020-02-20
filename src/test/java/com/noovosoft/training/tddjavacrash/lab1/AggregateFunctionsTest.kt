package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertEquals

class Numbers(val expected: Int, vararg val nums: Int)

class NumbersForAvg(val expected: Double, vararg val nums: Int)

class NumbersForAggr(val expected: Aggregate, vararg val nums: Int)

class AggregateFunctionsTest {
    class MinFunctionTest {
        @ParameterizedTest
        @MethodSource("numbersAndMin")
        fun assertMin(input: Numbers) {
            assertEquals(input.expected, min(*(input.nums)))
        }

        @Test
        fun `min() is 2147483647`() {
            assertEquals(2147483647, min())
        }

        @Test
        fun `min(min(50, 4), min()) is 4`() {
            assertEquals(4, min(min(50, 4), min()))
        }

        companion object {
            @JvmStatic
            fun numbersAndMin() = listOf<Numbers>(
                    Numbers(2147483647),
                    Numbers(0, 0),
                    Numbers(0, 0, 1),
                    Numbers(-1, -1, 0, 1),
                    Numbers(1, 50, 40, 30, 20, 10, 1),
                    Numbers(-200, 500, 400, 309, -200, 100, 1000),
                    Numbers(400, 500, 400, 3000, 2890, 8910, 1675))
        }
    }

    class MaxFunctionTest {
        @ParameterizedTest
        @MethodSource("numbersAndMax")
        fun assertMax(input: Numbers) {
            assertEquals(input.expected, max(*(input.nums)))
        }

        @Test
        fun `max() is -2147483648`() {
            assertEquals(-2147483648, max())
        }

        @Test
        fun `max(max(50, 4), max()) is 4`() {
            assertEquals(50, max(max(50, 4), max()))
        }

        companion object {
            @JvmStatic
            fun numbersAndMax() = listOf<Numbers>(
                    Numbers(-2147483648),
                    Numbers(0, 0),
                    Numbers(0, 0, -1),
                    Numbers(1, -1, 0, 1),
                    Numbers(50, 50, 40, 30, 20, 10, 1),
                    Numbers(1000, 500, 400, 309, -200, 100, 1000),
                    Numbers(8910, 500, 400, 3000, 2890, 8910, 1675))
        }
    }

    class CountFunctionTest {
        @ParameterizedTest
        @MethodSource("numbersAndCount")
        fun assertCount(input: Numbers) {
            assertEquals(input.expected, count(*(input.nums)))
        }

        @Test
        fun `count() is 0`() {
            assertEquals(-0, count())
        }

        companion object {
            @JvmStatic
            fun numbersAndCount() = listOf<Numbers>(
                    Numbers(0),
                    Numbers(1, 0),
                    Numbers(2, 0, -1),
                    Numbers(3, -1, 0, 1),
                    Numbers(6, 50, 40, 30, 20, 10, 1),
                    Numbers(8, 500, 400, 309, -200, 100, 1000, 45, 76),
                    Numbers(10, 500, 400, 3000, 2890, 8910, 1675, 321, 45675, 2323, 567))
        }
    }

    class AvgFunctionTest {
        @ParameterizedTest
        @MethodSource("numbersAndAvg")
        fun assertAvg(input: NumbersForAvg) {
            assertEquals(input.expected, avg(*(input.nums)))
        }

        @Test
        fun `avg() is NaN`() {
            assertEquals(Double.NaN, avg())
        }

        @Test
        fun `avg(avg(50, 4), avg()) is 27`() {
            assertEquals(27.0, avg(50, 4))
        }

        companion object {
            @JvmStatic
            fun numbersAndAvg() = listOf<NumbersForAvg>(
                    NumbersForAvg(Double.NaN),
                    NumbersForAvg(0.5, 0, 1),
                    NumbersForAvg(1.33, -1, 1, 4),
                    NumbersForAvg(0.0, -1, 0, 1),
                    NumbersForAvg(25.17, 50, 40, 30, 20, 10, 1),
                    NumbersForAvg(5.75, 4, 5, 1, 2, 9, 7, 10, 8),
                    NumbersForAvg(35.75, 15, 9, 55, 41, 35, 20, 62, 49))
        }
    }

    class CombinedFunctionTest {
        @ParameterizedTest
        @MethodSource("numbersAndAggr")
        fun assertAggregate(input: NumbersForAggr) {
            assertEquals(input.expected, aggregate(*(input.nums)))
        }

        companion object {
            @JvmStatic
            fun numbersAndAggr() = listOf(
                    NumbersForAggr(Aggregate(2147483647, -2147483648, 0, Double.NaN)),
                    NumbersForAggr(Aggregate(0, 0, 1, 0.0), 0),
                    NumbersForAggr(Aggregate(0, 1, 2, 0.5), 0, 1),
                    NumbersForAggr(Aggregate(1, 50, 6, 25.17), 50, 40, 30, 20, 10, 1),
                    NumbersForAggr(Aggregate(10, 323, 6, 68.5), 11, 20, 13, 10, 34, 323))
        }
    }
}