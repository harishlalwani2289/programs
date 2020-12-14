package com.harish.threads;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using runnable interface");
    }

    public static void main(String[] args) {
        RunnableDemo runnableDemo =  new RunnableDemo();
        Thread thread = new Thread(runnableDemo);
        thread.start();
    }
}
