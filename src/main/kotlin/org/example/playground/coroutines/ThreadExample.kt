package org.example.playground.coroutines

import kotlin.concurrent.thread

fun main() {
    println("Thread: ${Thread.currentThread().name}")
    thread {
        println("Thread: ${Thread.currentThread().name}")
    }
}