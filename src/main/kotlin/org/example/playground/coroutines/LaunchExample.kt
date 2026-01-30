package org.example.playground.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Before runBlocking")
    runBlocking {
        println("Before launch")
        launch {
            println("Hello, ")
            delay(200L)
            println("world!")
        }
        println("After launch")
    }
    println("After runBlocking")
}