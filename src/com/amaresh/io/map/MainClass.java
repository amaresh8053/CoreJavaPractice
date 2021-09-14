package com.amaresh.io.map;

import java.util.HashMap;
import java.util.Map;

public class MainClass {

    public static void main(String args[]){
        Map<Integer,String> hMap1=new HashMap<>();

        hMap1.put(1,"A");
        hMap1.put(2,"B");
        hMap1.put(3,"C");
        hMap1.put(4,"D");

        for(Map.Entry<Integer,String> e:hMap1.entrySet()){
            System.out.println(e.getValue());
        }




    }
}
