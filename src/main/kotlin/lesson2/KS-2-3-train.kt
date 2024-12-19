package org.example.lesson2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val arrivalTime = departureHour * 60 + departureMinute + 457
    val arrivalHour = arrivalTime / 60
    val arrivalMinute = arrivalTime % 60

    println("$arrivalHour:$arrivalMinute")

}
