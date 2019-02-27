package com.tms.coroutine

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.concurrent.atomic.AtomicInteger

fun main() {
    val count = AtomicInteger()

    for (i in 1..1_000_000) {
        GlobalScope.launch {
            count.addAndGet(1)
        }
    }

    println(count.get())
}