package com.tms.coroutine

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.runBlocking

fun main(args: Array<String>) {

    val deferredIntList = (1..1_000_000).map {
        async {
            1
        }
    }

//    val sum = deferredIntList.sumBy { deferredInt ->  deferredInt.await() }
//    println("Sum $sum")

}