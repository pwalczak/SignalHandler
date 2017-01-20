package com.company;

/**
 * Created by piotr.walczak on 20.01.2017.
 */
public class ExecutionThread implements Runnable {

    private static int number = 0;

    @Override
    public void run() {
        System.out.println(number);
        number++;
    }
}
