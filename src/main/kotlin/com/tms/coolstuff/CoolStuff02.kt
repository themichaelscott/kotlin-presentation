package com.tms.coolstuff

/**
 * Demonstrates toString() on data class
 */
fun main() {

    val employeeList = listOf(
            Manager("Trevor", "Labs"),
            Programmer("Mike", 10_000)
    )

    for (employee in employeeList) {
        println("\n$employee")
    }

}