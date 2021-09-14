package com.amaresh.io.Test;

public class Customer implements  Comparable<Customer>{

    private String name;
    private String age;

    public Customer(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public int compareTo(Customer o) {
            return this.name.compareTo(o.getName());
    }

    @Override
    public int hashCode(){

        return this.name.hashCode();

    }
}
