package com.tms.oven

fun main(args: Array<String>) {
    whenTest()
}




fun whenTest() {

    val employeeList = listOf(null,
            Manager("Mike", "Enterprise"),
            Programmer("Jordan", 10_000),
            Programmer("Jeff", 1_000, null))


    val first = employeeList.first()

    if (first is Manager) {
        first.goToMeeting()
    }

    for (employee in employeeList.filterNotNull()) {
        when (employee) {
            null -> println("you're null")
            is Manager -> employee.goToMeeting()
            is Programmer -> employee.giveRaise()
        }
    }


    val last = employeeList.last()

    if (last is Programmer) {
        printFavDrink(last.favoriteDrink)
    }

}

fun printFavDrink(drink: String?) {
    println(drink ?: "no favorite drink")
}

