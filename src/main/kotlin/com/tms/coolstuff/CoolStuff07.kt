package com.tms.coolstuff

/**
 * Overrides default parameter.
 * Adds method to print programmer's non-nullable favorite drink
 */
fun main() {

    val employeeList = listOf(
            Manager("Mike", "Enterprise"),
            null,
            Programmer("Jordan", 30_000, "Crystal Pepsi")
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
        programmer.salary < 20_000 -> programmer.giveRaise()
        System.currentTimeMillis() < 0 -> println("this will never get called if the machine time is right")
        programmer.favoriteDrink != "Mtn Dew" -> printFavDrink(programmer.favoriteDrink)
    }
}

fun printFavDrink(drink: String) {
    println(drink)
}