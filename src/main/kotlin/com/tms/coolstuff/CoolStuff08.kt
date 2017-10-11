package com.tms.coolstuff

/**
 * Changes takeCareOfProgrammer to take/handle nullable
 * Changes favorite drink in Programmer to nullable
 * Adds a new programmer, Jeff, who hates soda.
 * Updates printFavDrink() to take a nullable favorite drink
 */
fun main(args: Array<String>) {

    val employeeList = listOf(
            Manager("Mike", "Enterprise"),
            null,
            Programmer("Jeff", 30_000, null),
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

private fun takeCareOfProgrammer(programmer: Programmer?) {
    programmer ?: return // this example won't pass in a null programmer, but now we handle it
    when {
        programmer.salary < 20_000 -> programmer.giveRaise()
        System.currentTimeMillis() < 0 -> println("this will never get called if the machine time is right")
        programmer.favoriteDrink != "Mtn Dew" -> printFavDrink(programmer.favoriteDrink)
    }
}

fun printFavDrink(drink: String?) {
    println(drink) // prints "null"
}