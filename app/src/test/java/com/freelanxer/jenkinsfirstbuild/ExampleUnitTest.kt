package com.freelanxer.jenkinsfirstbuild

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        val expected = 4
        val actual = MathUtil().add(2, 3)
        assertEquals(expected, actual)
    }
}