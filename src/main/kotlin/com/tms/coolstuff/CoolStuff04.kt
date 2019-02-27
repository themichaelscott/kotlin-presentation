package com.tms.coolstuff

/**
 * Demonstrates when()
 */
fun main() {

    val employeeList = listOf(
            Manager("Mike", "Enterprise"),
            Programmer("Jordan", 10_000)
    )

    for (employee in employeeList) {
        println("\n$employee")
    }
    println()

    val first = employeeList.first()

    when (first) {
        is Manager -> first.goToMeeting()
        is Programmer -> first.giveRaise()
    }

}