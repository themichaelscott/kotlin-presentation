package com.tms.oven

data class Manager(val name: String, val dept: String?) {

    fun goToMeeting() {
        println("$name from $dept fell asleep again!")
    }
}