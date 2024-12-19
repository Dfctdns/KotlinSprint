package org.example.lesson4

const val ARM_DAY = 1
const val LEG_DAY = 0
const val BACK_DAY = 0
const val ABS_DAY = 1

fun main() {
    val dayOfTraining = 5
    println("""
        Упражнения для рук: ${ARM_DAY == dayOfTraining % 2}
        Упражнения для ног: ${LEG_DAY == dayOfTraining % 2}
        Упражнения для спины: ${BACK_DAY == dayOfTraining % 2}
        Упражнения для пресса: ${ABS_DAY == dayOfTraining % 2}
    """.trimIndent())
}