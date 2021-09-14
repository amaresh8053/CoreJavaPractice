package com.amaresh.io.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomerServiceImpl {

    private Set<Customer> customerSet=new TreeSet<>();

    public Boolean addCustomer(Customer customer){
        customerSet.add(customer);
        return true;
    }

    public static void main(String[] args){

        CustomerServiceImpl customerService=new CustomerServiceImpl();
        customerService.addCustomer(new Customer("A","29"));
        customerService.addCustomer(new Customer("B","30"));
        customerService.addCustomer(new Customer("C","30"));

        System.out.println(customerService.customerSet);




    }
}
