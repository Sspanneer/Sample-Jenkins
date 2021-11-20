package com.example.mypackage;

import com.example.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class CustomerDetails {

    protected void printDetails() {
        System.out.println("PrintDetails");
    }

    public static List<Customer> customerList = createCustomerList();
    public static Map<Integer, List<Customer>> customerMap;

    public void displayCustomerDetails() {

        System.out.print("AccNo" + "   " + "AccountHolder"+ "   " + "PinNumber" + "   " + "AccountBalance" + "   ");
        System.out.println();
        customerMap.entrySet().stream().forEach(customerValue -> {
            List<Customer> customerValueList = customerValue.getValue();
            customerValueList.stream().forEach(customer -> System.out.print(customer.getAccNumber() + "   " + customer.getAccountHolder() + "   " + customer.getPinNumber() + "   " + customer.getAccountBalance()));
            System.out.println();
        });
    }

    public static List<Customer> createCustomerList() {
        customerList = new ArrayList<>();
        customerList.add(new Customer(101,"Suresh",2343,25234 ));
        customerList.add(new Customer(102,"Ganesh",5432, 34123  ));
        customerList.add(new Customer(103,"Magesh",7854,26100 ));
        customerList.add(new Customer(104,"Naresh",2345,80000 ));
        customerList.add(new Customer(105,"Harish",1907,103400 ));
        customerMap = customerList.stream().collect(Collectors.groupingBy(Customer::getAccNumber));

        return customerList;
    }

}
