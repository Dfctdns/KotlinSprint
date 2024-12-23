package org.example.lesson2

const val MINUTES = 60
fun main() {

    val departureHour = 9
    val departureMinute = 39
    val timeOfRoad = 457
    val arrivalTime = departureHour * MINUTES + departureMinute + timeOfRoad
    val arrivalHour = arrivalTime / MINUTES
    val arrivalMinute = arrivalTime % MINUTES

    println("$arrivalHour:$arrivalMinute")

}
