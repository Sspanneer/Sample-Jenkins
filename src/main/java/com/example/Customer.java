package com.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Integer accNumber;
    private String accountHolder;
    private Integer pinNumber;
    private Integer accountBalance;
}

