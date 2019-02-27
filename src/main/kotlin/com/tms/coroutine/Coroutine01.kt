package com.tms.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


/**
 * Introduce launch, delay and thread.sleep just in case (point out no exceptions handled)
 */
fun main() {
    println("Start")

    // Start a coroutine
    GlobalScope.launch {
        delay(1000) // delay for 1 second
        println("Hello")
    }

    Thread.sleep(2000) // wait for 2 seconds
    println("Stop")
}