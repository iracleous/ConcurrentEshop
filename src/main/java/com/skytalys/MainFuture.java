package com.skytalys;

import java.util.concurrent.*;

public class MainFuture    {


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //ExecutorService allows us to execute tasks on threads asynchronously
        ExecutorService es = Executors.newSingleThreadExecutor();
//getting future
//the method submit() submits a value-returning task for execution and returns the Future
        Future<String> future = es.submit(
                            new WorkerCallable(10)
        );
//checks if the task is completed or not
        while(!future.isDone())
        {
            System.out.println("The task is still in process.....");
//sleep thread for 2 milliseconds
            Thread.sleep(200);
        }
        System.out.println("Task completed! getting the result");
//getting the result after completing the task
        String result = future.get();
//prints the result
        System.out.println(result);
        es.shutdown();
    }
}

