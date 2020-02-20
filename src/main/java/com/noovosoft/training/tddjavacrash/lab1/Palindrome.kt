package com.noovosoft.training.tddjavacrash.lab1

val NOT_WORD_CHARS = Regex("""\W+""")
fun isPalindrome(input: String): Boolean {
    val cleaned = input.replace(NOT_WORD_CHARS, "").toLowerCase()
    return cleaned == cleaned.reversed()
}