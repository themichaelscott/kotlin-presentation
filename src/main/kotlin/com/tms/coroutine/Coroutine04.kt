package com.tms.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async

fun main() {

    val deferredIntList = (1..1_000_000).map {
        GlobalScope.async {
            1
        }
    }

//    val sum = deferredIntList.sumBy { deferredInt ->  deferredInt.await() }
//    println("Sum $sum")

}