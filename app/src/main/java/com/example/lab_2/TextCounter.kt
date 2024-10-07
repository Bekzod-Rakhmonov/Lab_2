package com.example.lab_2

class TextCounter {

    fun countWords(input: String): Int {
        return input.trim().split("\\s+|,|\\.".toRegex()).filter { it.isNotEmpty() }.size
    }

    fun countChars(input: String): Int {
        return input.replace("\\s".toRegex(), "").length
    }
}