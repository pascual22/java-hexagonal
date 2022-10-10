package com.osmago.javahexagonal.infra.inputport;

import java.util.List;

import com.osmago.javahexagonal.domain.Customer;

public interface CustomerInputPort {

    public Customer createCustomer(String name, String country);

    public Customer getById(String customerId);

    public List<Customer> getAll();
    
}
