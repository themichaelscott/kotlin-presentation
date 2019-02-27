package com.tms.coolstuff

/**
 * Demonstrates first() and smart cast
 */
fun main() {

    val employeeList = listOf(
            Manager("Trevor", "Labs"),
            Programmer("Mike", 10_000)
    )

    for (employee in employeeList) {
        println("\n$employee")
    }
    println()

    val first = employeeList.first()

    if (first is Manager) {
        first.goToMeeting()
    } else if (first is Programmer) {
        first.giveRaise()
    }
}