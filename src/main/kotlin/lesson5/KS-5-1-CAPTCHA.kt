package org.example.lesson5

const val PROBLEM = "2 + 2"
const val CORRECT_ANSWER = 4
fun main() {

    print("Решите пример: $PROBLEM = ")
    var answer = readln().toInt()

    if (answer == CORRECT_ANSWER) println("Добро пожаловать!")
    else println("Доступ запрещен")

}