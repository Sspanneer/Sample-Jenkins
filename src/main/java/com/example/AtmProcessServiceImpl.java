package com.example;

import com.example.mypackage.CustomerDetails;
import java.util.List;
import java.util.Optional;

public class AtmProcessServiceImpl implements  AtmProcessService{
    @Override
    public void checkBalance(Integer accountNumber) {
        List<Customer> customerList = CustomerDetails.customerMap.get(accountNumber);
        System.out.println("Balance : " + customerList.get(0).getAccountBalance());

    }

    @Override
    public void withdrawMoney() {

    }

    @Override
    public void transferAmount() {

    }

    @Override
    public void miniStatement() {

    }

    @Override
    public boolean validateUser(int accountNumber, int pinNumber) {
        CustomerDetails customerDetails = new CustomerDetails();

        Optional<Customer> optionalCustomer = CustomerDetails.customerList.stream().filter(customer -> customer.getAccNumber().equals(accountNumber) && customer.getPinNumber().equals(pinNumber)).findFirst();
        return optionalCustomer.isPresent() ? true : false;
    }

}
