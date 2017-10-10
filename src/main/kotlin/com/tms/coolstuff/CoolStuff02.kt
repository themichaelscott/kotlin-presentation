package com.tms.coolstuff

/**
 * Demonstrates toString() on data class
 */
fun main(args: Array<String>) {

    val employeeList = listOf(
            Manager("Mike", "Enterprise"),
            Programmer("Jordan", 10_000)
    )

    for (employee in employeeList) {
        println("\n$employee")
    }

}