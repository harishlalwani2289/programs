package com.harish.threads;

public class TestThreadSleep extends Thread {
    @Override
    public void run() {
        for(int i=0;i<400;i++) {
            System.out.println("Number is : " + i + " from " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        TestThreadSleep testThreadSleep1 = new TestThreadSleep();
        TestThreadSleep testThreadSleep2 = new TestThreadSleep();
        testThreadSleep1.setName("Thread1");
        testThreadSleep2.setName("Thread2");

        testThreadSleep2.start();
        testThreadSleep1.start();

    }
}
