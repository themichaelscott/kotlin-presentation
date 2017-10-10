package com.tms.coolstuff

/**
 * Demonstrates forEach() and nulls in list for smart cast
 */
fun main(args: Array<String>) {

    val employeeList = listOf(
            Manager("Mike", "Enterprise"),
            null,
            Programmer("Jordan", 10_000)
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