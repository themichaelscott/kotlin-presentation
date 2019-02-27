package com.tms.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {

    val deferredIntList = (1..1_000_000).map {
        GlobalScope.async {
            delay(1000)
            1
        }
    }

    runBlocking {
        val sum = deferredIntList.sumBy { deferredInt -> deferredInt.await() }
        println("Sum $sum")
    }
}