package com.tms.coolstuff

/**
 * Updates printFavDrink() to handle a nullable favorite drink
 */
fun main(args: Array<String>) {

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
            is Programmer -> takeCareOfProGamers(employee)
        }
    }
}

fun takeCareOfProGamers(programmer: Programmer) {
    when {
        programmer.salary < 20_000 -> programmer.giveRaise()
        System.currentTimeMillis() < 0 -> println("this will never get called if the machine time is right")
        programmer.favoriteDrink != "Mtn Dew" -> printFavoriteDrink(programmer.favoriteDrink)
    }
}

fun printFavoriteDrink(drink: String?) {
    println(drink ?: "Not a real pro gamer!")
}