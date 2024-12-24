package org.example.lesson4

fun main() {
    var dayOfTraining = 5
    val isEven = dayOfTraining % 2 == 0
    println("""
        Упражнения для рук: ${!isEven}
        Упражнения для ног: ${isEven}
        Упражнения для спины: ${isEven}
        Упражнения для пресса: ${!isEven}
    """.trimIndent())
}