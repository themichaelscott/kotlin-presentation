package com.tms.coolstuff

/**
 * Updates printFavDrink() to handle a nullable favorite drink
 */
fun main() {

    val employeeList = listOf(
            Manager("Mike", "Enterprise"),
            null,
//            Programmer("Jeff", 30_000, favoriteDrink = null),
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
    programmer ?: return
    when {
        programmer.salary < 20_000 -> programmer.giveRaise()
        System.currentTimeMillis() < 0 -> println("this will never get called if the machine time is right")
        programmer.favoriteDrink != "Mtn Dew" -> printFavoriteDrink(programmer.favoriteDrink)
    }
}

private fun printFavoriteDrink(drink: String?) {
    println(drink ?: "Real programmers have a favorite drink!")
}