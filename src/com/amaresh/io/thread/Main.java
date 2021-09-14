package com.amaresh.io.thread;

public class Main {
    public static void main(String args[]) throws InterruptedException {


        Thread t1=new Thread(new MyThread());
        t1.start();
        t1.join();

        for(int i=0;i<10;i++){
            System.out.println("Main thread");
        }
    }
}
