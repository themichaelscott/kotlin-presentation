package com.tms.coolstuff

/**
 * Demonstrates forEach() and nulls in list for smart cast
 */
fun main() {

    val employeeList = listOf(
            Manager("Trevor", "Labs"),
            null,
            Programmer("Mike", 10_000)
    )

    employeeList.forEach { employee ->
        println("\n$employee")
        when (employee) {
            is Manager -> employee.goToMeeting()
            is Programmer -> employee.giveRaise()
            null -> println("I'm so null")
        }
    }

}