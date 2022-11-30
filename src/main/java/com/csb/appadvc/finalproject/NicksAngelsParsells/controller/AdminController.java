package com.csb.appadvc.finalproject.NicksAngelsParsells.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AdminController {

    @GetMapping("/admin")
    public String admin(){
        return "admin/index";
    }
    @GetMapping("/edit-products")
    public String editproducts(){
        return "admin/edit-products";
    }
    @GetMapping("/add-products")
    public String addproducts(){
        return "admin/add-products";
    }

    @GetMapping("/view-products")
    public String viewproducts(){
        return "admin/view-products";
    }

    @GetMapping("/checkout")
    public String checkout(){return "checkout"; }

    @GetMapping("/bestseller")
    public String bestseller(){return "best-seller"; }
}

