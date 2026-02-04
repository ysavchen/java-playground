package org.example.playground.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/**
 * Флаг для отладки корутин: -Dkotlinx.coroutines.debug
 */
fun main() {
    println("[${Thread.currentThread().name}] Before runBlocking")
    runBlocking {
        println("[${Thread.currentThread().name}] Before launch")
        launch {
            println("[${Thread.currentThread().name}] Hello, ")
            delay(200L)
            println("[${Thread.currentThread().name}] world!")
        }
        println("[${Thread.currentThread().name}] After launch")
    }
    println("[${Thread.currentThread().name}] After runBlocking")
}