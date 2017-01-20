package com.company;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) {
        // write your code here
        long timeOfStart = System.currentTimeMillis();
        ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
        registerHook(new ShutdownThread(ses, timeOfStart));
        ses.scheduleWithFixedDelay(new ExecutionThread(), 0, 500, TimeUnit.MILLISECONDS);

    }

    public static void registerHook(Runnable r) {
        Runtime.getRuntime().addShutdownHook(new Thread(r));
    }
}
