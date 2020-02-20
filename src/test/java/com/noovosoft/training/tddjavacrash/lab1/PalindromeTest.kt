package com.noovosoft.training.tddjavacrash.lab1

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PalindromeTest {
    @ParameterizedTest
    @MethodSource("palindromes")
    fun assertIsPalindrome(input: String) {
        assertTrue(isPalindrome(input))
    }

    @ParameterizedTest
    @MethodSource("nonPalindromes")
    fun assertIsNotPalindrome(input: String) {
        assertFalse(isPalindrome(input))
    }

    companion object {
        @JvmStatic
        fun palindromes() = listOf("", "a", "aa", "Wow", "Anna", "Civic", "Kayak", "Level", "Madam", "Mom", "Noon", "Racecar",
                "Radar", "Redder", "Refer", "Repaper", "Rotator", "Rotor", "Sagas", "Solos", "Stats", "Tenet", "Wow")

        @JvmStatic
        fun nonPalindromes() = listOf("add", "amar", "affga", "Woww", "MAnna", "Civics", "Nalayak", "Levels", "Mad", "Moon", "Noobie", "Racecars")
    }
}