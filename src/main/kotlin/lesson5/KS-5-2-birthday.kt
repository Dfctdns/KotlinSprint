package org.example.lesson5


const val CURRENT_YEAR = 2024
const val AGE_OF_MAJORITY = 18

fun main() {

    print("Введите вашу дату рождения: ")
    var birthData = readln().toInt()
    val userAge = CURRENT_YEAR - birthData

    if(userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")

}