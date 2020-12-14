package com.harish.threads;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println("Inside thread running");
        System.out.println(this.getThreadGroup().activeCount());
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.setName("Harish");
        threadDemo.start();
    }
}
