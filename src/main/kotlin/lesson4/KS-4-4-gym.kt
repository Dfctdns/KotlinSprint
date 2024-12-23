package org.example.lesson4

const val ARM_DAY = true
const val LEG_DAY = false
const val BACK_DAY = false
const val ABS_DAY = true

fun main() {
    var dayOfTraining = 5
    val isEven = dayOfTraining % 2 == 1
    println("""
        Упражнения для рук: ${ARM_DAY == isEven}
        Упражнения для ног: ${LEG_DAY == isEven}
        Упражнения для спины: ${BACK_DAY == isEven}
        Упражнения для пресса: ${ABS_DAY == isEven}
    """.trimIndent())
}