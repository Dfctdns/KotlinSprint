package org.example.lesson2


fun main() {

    val numberOfEmployee = 50
    val numberOfIntern = 30
    val employeeSalary = 30_000
    val internSalary = 20_000
    val employeeSalaryAll = numberOfEmployee * employeeSalary
    val internSalaryAll = numberOfIntern * internSalary
    val overallSalary = employeeSalaryAll + internSalaryAll
    val averageSalary = overallSalary / (numberOfIntern + numberOfEmployee)

    println(employeeSalaryAll)
    println(overallSalary)
    println(averageSalary)

}