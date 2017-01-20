package com.company;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/**
 * Created by piotr.walczak on 20.01.2017.
 */
public class ShutdownThread implements Runnable {
    ExecutorService executorService;
    long timeOfStart;

    public ShutdownThread(ExecutorService s, long timeOfStart) {
        this.executorService = s;
        this.timeOfStart = timeOfStart;
    }

    @Override
    public void run() {
        executorService.shutdownNow();
        long timeOfRun = calculateTimeOfRun();
        System.out.println("System has ran " + timeOfRun / 1000.0 + "seconds");
    }

    private long calculateTimeOfRun()
    {
        return System.currentTimeMillis() - timeOfStart;
    }
}
