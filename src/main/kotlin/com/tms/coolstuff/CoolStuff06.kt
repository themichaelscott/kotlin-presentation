package com.tms.coolstuff

import java.util.*

/**
 * Demonstrates filterNotNull() on collections
 * Demonstrates different possibilities in when statement
 */
fun main(args: Array<String>) {

    val employeeList = listOf(
            Manager("Mike", "Enterprise"),
            null,
            Programmer("Jordan", 10_000)
    )

    employeeList.filterNotNull().forEach { employee ->
        println("\n$employee")
        when (employee) {
            is Manager -> employee.goToMeeting()
            is Programmer -> takeCareOfProgrammers(employee)
        }
    }
}

fun takeCareOfProgrammers(programmer: Programmer) {
    when {
        programmer.salary < 20_000 -> programmer.giveRaise()
        System.currentTimeMillis() < 0 -> println("this will never get called if the machine time is right")
    }
}