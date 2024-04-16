package com.skytalys.service;

import com.skytalys.model.Product;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadDemo {
    public void demo1() throws ExecutionException, InterruptedException {
        //ExecutorService allows us to execute tasks on threads asynchronously
        ExecutorService es = Executors.newSingleThreadExecutor();
//getting future
//the method submit() submits a value-returning task for execution and returns the Future
        Future<Product> future = es.submit(
                new WorkerCallable(10)
        );
//checks if the task is completed or not
        while(!future.isDone())
        {
            System.out.println("The task is still in process.....");
//sleep thread for 2 milliseconds
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Task completed! getting the result");
//getting the result after completing the task
        Product result = future.get();
//prints the result
        System.out.println(result);
        es.shutdown();
    }
}

