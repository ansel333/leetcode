package org.ansel.codewars

import org.ansel.codewars.HelloWorld.Companion.greet
import org.junit.Assert.*
import org.junit.Test

class HelloWorldTest {
    @Test
    @Throws(Exception::class)
    fun testHelloWorld() {
        assertEquals("hello world!", greet())
    }
}