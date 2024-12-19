package org.example.lesson2

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val timeOfRoad = 457
    val arrivalTime = departureHour * 60 + departureMinute + timeOfRoad
    val arrivalHour = arrivalTime / 60
    val arrivalMinute = arrivalTime % 60

    println("$arrivalHour:$arrivalMinute")

}
