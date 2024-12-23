package org.example.lesson4

const val NUMBER_OF_SEATS = 13

fun main() {

    val bookedSeatsToday = 13
    val bookedSeatsTomorrow = 9

    println("Доступность столиков на сегодня: ${bookedSeatsToday < NUMBER_OF_SEATS}")
    println("Доступность столиков на завтра: ${bookedSeatsTomorrow < NUMBER_OF_SEATS}")

}