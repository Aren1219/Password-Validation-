package com.example.validpassworcheck

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class PasswordTest{

    private lateinit var passwordChecker: Password

    @Before
    fun setUp(){
        passwordChecker = Password()
    }

    @Test
    fun `valid passwords`(){
        assertEquals(true,passwordChecker.checkPassword("qybYv68!"))
        assertEquals(true,passwordChecker.checkPassword("abcD3454624!"))
        assertEquals(true,passwordChecker.checkPassword("145vnwM@"))
        assertEquals(true,passwordChecker.checkPassword("(1234567890)aX"))
        assertEquals(true,passwordChecker.checkPassword("qybYv68!cv4"))
        assertEquals(true,passwordChecker.checkPassword("765%MBYUBi"))
    }

    @Test
    fun `empty password`(){
        assertEquals(false,passwordChecker.checkPassword(""))
    }

    @Test
    fun `invalid length`(){
        assertEquals(false,passwordChecker.checkPassword("1(aA"))
        assertEquals(false,passwordChecker.checkPassword("(1234567890)aX(1234567890)aX(1234567890)aX"))
    }

    @Test
    fun `missing special char`(){
        assertEquals(false,passwordChecker.checkPassword("avaDey78yC"))
        assertEquals(false,passwordChecker.checkPassword("?a?veNB34"))
    }

    @Test
    fun `missing cap letter`(){
        assertEquals(false,passwordChecker.checkPassword("awef78y45!"))
    }

    @Test
    fun `missing small lettrt`(){
        assertEquals(false,passwordChecker.checkPassword("@UGVR7849"))
    }
}