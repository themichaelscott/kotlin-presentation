package com.tms.coolstuff

/**
 * Another data class to be used in demo
 */
data class Manager(val name: String, val dept: String) {

    fun goToMeeting() {
        println("$name from $dept fell asleep again!")
    }
}