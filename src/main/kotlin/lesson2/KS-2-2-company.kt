package org.example.lesson2


fun main() {


    val numberOfEmployee = 50
    val numberOfIntern = 30
    val employeeSalary = 30_000
    val internSalary = 20_000
    val employeeSalaryAll = numberOfEmployee * 30_000
    val internSalaryAll = numberOfIntern * 20_000
    val overallSalary = employeeSalaryAll + internSalaryAll
    val averageSalary = overallSalary / (numberOfIntern + numberOfEmployee)

    println(employeeSalaryAll)
    println(overallSalary)
    println(averageSalary)

}