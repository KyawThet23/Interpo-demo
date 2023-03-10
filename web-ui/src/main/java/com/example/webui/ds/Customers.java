package com.example.webui.ds;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Spliterator;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
@AllArgsConstructor
public class Customers {

    private List<Customer> customers;
    private Customers(){

    }
    public Customers(Spliterator<Customer>spliterator){
        customers = StreamSupport.stream(spliterator, false)
                .collect(Collectors.toList());
    }
}
