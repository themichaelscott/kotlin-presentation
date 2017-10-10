package com.tms.coroutine

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {

    val deferred = (1..1_000_000).map {
        async {
            doWork(1)
        }
    }

    runBlocking {
        val sum = deferred.sumBy { it.await() }
        println("Sum $sum")
    }
}

suspend fun doWork(n: Int): Int {
    delay(1000)
    return n
}