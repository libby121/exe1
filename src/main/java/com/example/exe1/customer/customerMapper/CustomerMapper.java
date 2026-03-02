package com.example.exe1.customer.customerMapper;

import com.example.exe1.customer.dto.CustomerOut;
import com.example.exe1.customer.entity.Customer;

public class CustomerMapper {

    public static Customer dtoTpCustomer(CustomerOut customerOut){
        Customer c1 = new Customer();
        c1.setName(customerOut.name());
        c1.setPhones(customerOut.phones());
        return c1;
    }
    public static CustomerOut  customerToDto(Customer c1){

        return new CustomerOut(c1.getName(), c1.getPhones());
    }
}
