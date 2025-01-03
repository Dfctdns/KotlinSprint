package org.example.lesson4

const val IS_SUNNY_WEATHER = true
const val TENT_IS_OPENED = true
const val AIR_HUMIDITY = 20
const val SEASON = "winter"

fun main() {

    val todayWeatherIsSunny = true
    val tentNowOpened = true
    val airHumidity = 20
    val seasonNow = "winter"
    val circumstancesCheck = todayWeatherIsSunny == IS_SUNNY_WEATHER && tentNowOpened == TENT_IS_OPENED
            && airHumidity == AIR_HUMIDITY && seasonNow != SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? ${circumstancesCheck}")

}