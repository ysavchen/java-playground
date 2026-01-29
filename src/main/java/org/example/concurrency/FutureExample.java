package org.example.concurrency;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class FutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<String> future = CompletableFuture.supplyAsync(() -> "Hello, ").thenApply(str -> str + "world!");
        String result = future.get();
        System.out.println(result);
    }
}
