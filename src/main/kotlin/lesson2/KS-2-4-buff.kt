package org.example.lesson2

fun main() {

    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20

    val buffedCrystalOre = (crystalOre * buffPercent / 100).toInt()
    val buffedIronOre = (ironOre * buffPercent / 100).toInt()

    println("$buffedCrystalOre, $buffedIronOre")

}
