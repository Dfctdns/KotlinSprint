package org.example.lesson2

const val PERCENTS = 100
fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20

    val buffedCrystalOre = (crystalOre * buffPercent / PERCENTS).toInt()
    val buffedIronOre = (ironOre * buffPercent / PERCENTS).toInt()

    println("$buffedCrystalOre, $buffedIronOre")

}
