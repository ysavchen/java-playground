package org.example.playground.coroutines

import kotlinx.coroutines.asCoroutineDispatcher
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.util.concurrent.Executors

fun main() = runBlocking {
    val dispatcher = Executors.newSingleThreadExecutor().asCoroutineDispatcher()

    withContext(dispatcher) {
        delay(100L)
        println(Thread.currentThread().name)
    }

    dispatcher.close()

    // автоматическое закрытие диспетчера
    val dispatcher2 = Executors.newSingleThreadExecutor().asCoroutineDispatcher()

    dispatcher2.use {
        withContext(it) {
            delay(100L)
            println(Thread.currentThread().name)
        }
    }
}