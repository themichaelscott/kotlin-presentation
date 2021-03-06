package com.tms.coolstuff

/**
 * Adds a function to data class
 * Demonstrates templates
 */
data class Programmer(val name: String, var salary: Long, var favoriteDrink: String = "Mtn Dew") {

    fun giveRaise() {
        salary *= 100
        println("$name, your new salary is $$salary")
    }

}