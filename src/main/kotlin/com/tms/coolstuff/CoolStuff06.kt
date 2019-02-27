package com.tms.coolstuff

/**
 * Demonstrates filterNotNull() on collections
 * Demonstrates different possibilities in when statement
 * Demonstrates autocast
 */
fun main() {

    val employeeList = listOf(
            Manager("Trevor", "Labs"),
            null,
            Programmer("Mike", 10_000)
    )

    employeeList.filterNotNull().forEach { employee ->
        println("\n$employee")
        when (employee) {
            is Manager -> employee.goToMeeting()
            is Programmer -> takeCareOfProgrammer(employee)
        }
    }
}

private fun takeCareOfProgrammer(programmer: Programmer) {
    when {
        System.currentTimeMillis() < 0 -> println("this will never get called if the machine time is right")
        programmer.salary < 20_000 -> programmer.giveRaise()
    }
}