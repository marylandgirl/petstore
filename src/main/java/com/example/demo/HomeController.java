package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class HomeController {
    public static int counter = 0;
    private HashMap<Integer,Customer> customerList = new HashMap<Integer, Customer> ();
    private ArrayList<Customer> customers = new ArrayList<Customer>();

    @GetMapping("/home")
    public String listCustomers(Model model) {
        Customer testCustomer = new Customer();
        /*testCustomer.setName("Kim Levin");
        testCustomer.setPhone("555-555-5555");
        testCustomer.getPet().setName("Snoopy");
        testCustomer.getPet().setAge(12);
        testCustomer.getPet().setBreedtype("Boxer");
        testCustomer.getPet().setGender("Male");
        testCustomer.getPet().setPetType("Dog");
        customerList.put(++counter,testCustomer);
        customers.add(testCustomer);*/
        model.addAttribute("customerList",customerList);
        model.addAttribute("customers",customers);
        return "index";
    }

    @GetMapping("/add")
    public String addCustomer(Model model) {
        Customer customer = new Customer();
        model.addAttribute("customer",customer);
        return "add";
    }

    @PostMapping("/update")
    public String updateList(@ModelAttribute Customer customer , Model model) {
       customerList.put(++counter,customer);
        customers.add(customer);
       System.out.println("The number of customers is " + customerList.size());
       model.addAttribute("customerList",customerList);
        return "index";
    }
}
