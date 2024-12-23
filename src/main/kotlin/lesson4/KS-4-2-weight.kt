package org.example.lesson4

const val AVERAGE_MIN_WEIGHT = 35
const val AVERAGE_MAX_WEIGHT = 100
const val AVERAGE_VOLUME = 100

fun main(){

    val firstWeight = 20
    val firstVolume = 80
    val secondWeight = 50
    val secondVolume = 100

    println("Груз с весом $firstWeight кг и объемом $firstVolume л соответствует категории 'Average': " +
            "${firstWeight > AVERAGE_MIN_WEIGHT && firstWeight < AVERAGE_MAX_WEIGHT && firstVolume <= AVERAGE_VOLUME }")
    println("Груз с весом $secondWeight кг и объемом $secondVolume л соответствует категории 'Average':" +
            " ${secondWeight > AVERAGE_MIN_WEIGHT && secondWeight < AVERAGE_MAX_WEIGHT && secondVolume <= AVERAGE_VOLUME }")

}