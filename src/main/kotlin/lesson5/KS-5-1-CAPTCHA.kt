package org.example.lesson5

fun main() {

    val summandFirst = 2
    val summandSecond = 2
    print("Решите пример: $summandFirst + $summandSecond = ")
    var answer = readln().toInt()

    if (answer == summandFirst + summandSecond) println("Добро пожаловать!")
    else println("Доступ запрещен")

}