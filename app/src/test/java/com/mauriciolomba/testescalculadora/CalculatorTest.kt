package com.mauriciolomba.testescalculadora

import org.junit.Assert.*
import org.junit.Test


internal class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun `test when 2 + 2 returns 4`(){
        val expected = 4
        val result = calculator.sum(2,2)
        assertEquals(expected, result)
    }

    @Test
    fun `test when +2 -3 returns -1`(){
        val expected = -1
        val result = calculator.sum(2,-3)
        assertEquals(expected, result)
    }

    @Test
    fun `test when 2 - 2 returns 0`(){
        val expected = 0
        val result = calculator.sub(2,2)
        assertEquals(expected, result)
    }

    @Test
    fun `test when 2 - 5 returns -3`(){
        val expected = -3
        val result = calculator.sub(2,5)
        assertEquals(expected, result)
    }

    @Test
    fun `test when num is par return true`(){
        val expected = true
        val result = calculator.par(4)
        assertEquals(expected, result)
    }

    @Test
    fun `test when num is par return false`(){
        val expected = false
        val result = calculator.par(3)
        assertEquals(expected, result)
    }

    @Test
    fun `test when num is par when 0`(){
        val expected = true
        val result = calculator.par(0)
        assertEquals(expected, result)
    }

    @Test
    fun `test when num is impar return true`(){
        val expected = true
        val result = calculator.impar(3)
        assertEquals(expected, result)
    }

    @Test
    fun `test when num is impar return false`(){
        val expected = false
        val result = calculator.impar(6)
        assertEquals(expected, result)
    }

    @Test
    fun `test when num is impar when 0`(){
        val expected = false
        val result = calculator.impar(0)
        assertEquals(expected, result)
    }


}