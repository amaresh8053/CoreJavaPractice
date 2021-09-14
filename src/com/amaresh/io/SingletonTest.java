package com.amaresh.io;

public final class SingletonTest {

    private String name;

    private static SingletonTest singletonTest=new SingletonTest();;

    private SingletonTest(){
    }

    public static SingletonTest getInstance(){
            return singletonTest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
