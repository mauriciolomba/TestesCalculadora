package com.mauriciolomba.testescalculadora

internal class Calculator {
    fun sum(first: Int, second: Int) = first + second

    fun sub(first: Int, second: Int) = first - second

    fun par(num: Int) : Boolean {
        if (num == 0)
            return true
        else
            return num % 2 == 0
    }

    fun impar(num: Int) : Boolean {
        if (num == 0)
            return false
        else
            return num % 2 != 0
    }
}