package org.example.playground.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

fun main() {
    createSingleThread()
}

fun createSingleThread() {
    println("Thread: ${Thread.currentThread().name}")
    thread {
        println("Thread: ${Thread.currentThread().name}")
    }
}

/**
 * Запускаем 100_000 корутин и ждем их завершения
 */
fun createCoroutines() = runBlocking {
    val jobs = List(100_000) {
        launch {
            delay(1000L)
            print(".")
        }
    }
    jobs.joinAll()
}

/**
 * Запускаем 100_000 потоков и ждем их завершения
 */
fun createThreads() {
    val jobs = List(100_000) {
        thread {
            Thread.sleep(1000L)
            print(".")
        }
    }
    jobs.forEach { it.join() }
}