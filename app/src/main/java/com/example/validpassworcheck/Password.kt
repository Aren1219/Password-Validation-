package com.example.validpassworcheck

class Password {

    private val numbers = "1234567890"
    private val specials = "!@£\$%^&*()"
    private val letters = "abcdefghijklmnopqrstuvwxyz"
    private val capLetters = letters.uppercase()

    fun checkPassword(password: String): Boolean{
        if (password.length<8||password.length>16) return false
        if (
            checkIfCharInStrExists(password,letters)
            &&checkIfCharInStrExists(password,capLetters)
            &&checkIfCharInStrExists(password,specials)
            &&checkIfCharInStrExists(password,numbers)
        ) return true
        return false
    }

    private fun checkIfCharInStrExists(password: String, string: String): Boolean {
        for (charP in password){
            for (charS in string){
                if (charP==charS) return true
            }
        }
        return false
    }
}