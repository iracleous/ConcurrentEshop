package com.skytalys;

import java.util.concurrent.Callable;

public class WorkerCallable implements Callable<String> {
private int id;

    public WorkerCallable(int id) {
        this.id = id;
    }

    @Override
    public String call() throws Exception {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return "This is the end of "+id;
    }
}
