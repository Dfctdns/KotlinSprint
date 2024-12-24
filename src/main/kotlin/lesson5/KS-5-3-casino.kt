package org.example.lesson5

fun main() {

    var firstNumber = "1"
    var secondNumber = "41"

    print("Введите первое число: ")
    var firstInput = readln()

    print("Введите второе число: ")
    var secondInput = readln()

    if ((firstInput == firstNumber && secondInput == secondNumber) || (firstInput == secondNumber && secondInput == firstNumber))
        println("Поздравляем! Вы выйграли главный приз!")
    else if (firstInput == firstNumber || secondInput == secondNumber || secondInput == firstNumber || firstInput == secondNumber)
        println("Поздравляем! Вы выйграли утешительный приз!")
    else
        println("Неудача!")

    println("Победные номера: $firstNumber, $secondNumber")

}