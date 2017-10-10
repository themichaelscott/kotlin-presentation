package com.tms.coroutine

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {

    val deferred = (1..1_000_000).map {
        async {
            1
        }
    }

//    val sum = deferred.sumBy { it.await() }
//    println("Sum $sum")

}