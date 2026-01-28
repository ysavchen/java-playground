package org.example.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        repeat(100) { i ->
            println("job: I'm waiting $i ...")
            delay(100L)
        }
    }
    delay(500L)
    println("main: That's enough waiting")
    job.cancelAndJoin()
    println("main: Done")
}

fun main2() = runBlocking {
    withTimeout(1000L) {
        repeat(100) { i ->
            println("job: I'm waiting $i ...")
            delay(100L)
        }
    }
}