package com.example.exe1.customer.service;


import com.example.exe1.customer.dto.CustomerOut;
import com.example.exe1.customer.entity.Customer;
import com.example.exe1.customer.repository.CustomerRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Service
public class CustomerService {



    private final CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo){
        this.customerRepo = customerRepo;
    }

    public CustomerOut addOne(CustomerOut dto){
        Customer c1 = new Customer();
        c1.setPhones(dto.phones());
        c1.setName(dto.name());

       customerRepo.save(c1);
       return dto;
    }

    public List<String> getPhones(){
        return
                (List<String>) customerRepo.findAll().stream().flatMap(cust->
                cust.getPhones().stream()).
                toList();

}

    public List<String> getPhones(String l1){
        return filterPhones((customer)->
                customer.getName().startsWith(l1));
    }

    private List<String> filterPhones(Predicate<Customer> predicate){
        return customerRepo.
                 findAll().
                 stream()
                .filter(predicate)
                .flatMap(customer -> customer.getPhones().stream())
                .collect(Collectors.toList());
    }

}
