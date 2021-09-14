package com.amaresh.io;

import com.amaresh.io.arrays.ArrayTest;

import java.util.*;

public class MainClass {


    public static void main(String[] args) throws Exception {
        Thread t =new Thread(MainClass::pong);
        t.start();
        System.out.print("ping");
    }

    public static void pong(){
        System.out.print("pong");
    }
}