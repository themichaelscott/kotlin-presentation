package com.tms.coroutine

import kotlinx.coroutines.experimental.launch
import java.util.concurrent.atomic.AtomicInteger

fun main(args: Array<String>) {
    val count = AtomicInteger()

    for (i in 1..1_000_000) {
        launch {
            count.addAndGet(1)
        }
    }

    println(count.get())
}