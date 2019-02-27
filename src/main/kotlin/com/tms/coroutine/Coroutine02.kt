package com.tms.coroutine

import java.util.concurrent.atomic.AtomicInteger

fun main() {
    val count = AtomicInteger()

    for (i in 1..1_000) {
        val thread = object : Thread() {
            override fun run() {
                count.addAndGet(1)
            }
        }
        thread.run()
        // run() doesn't run in parallel - change to start()
    }

    println(count.get())
}
