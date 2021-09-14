package com.amaresh.io;

public enum EnumTest {

    INSTANCE;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
