package ru.ashamaz.model

data class User (var nickname: String = "", var age: Int=0) {
    override fun toString(): String = """{"nickname":"$nickname","age":$age}"""
}