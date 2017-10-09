package com.tms.oven

data class Programmer(val name: String, var salary: Long, var favoriteDrink: String? = "Mtn Dew") {

    fun giveRaise() {
        salary = 1_000_000
        println("$name, your new salary is $$salary")
    }

}