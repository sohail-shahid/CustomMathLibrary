package com.example.myutils

import java.lang.IllegalArgumentException

object MyMath {
    fun Plus(a: Int, b: Int): Int {
        return a + b
    }

    fun Minus(a: Int, b: Int): Int {
        return a - b
    }

    fun Multiply(a: Int, b: Int): Int {
        return a * b
    }

    fun Divide(a: Int, b: Int): Int {
        if (b == 0)
            throw IllegalArgumentException("Divide by zero error")
        else
            return a / b
    }
}