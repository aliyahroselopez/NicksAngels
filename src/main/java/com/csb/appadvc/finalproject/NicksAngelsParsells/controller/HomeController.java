package com.csb.appadvc.finalproject.NicksAngelsParsells.controller;

import com.csb.appadvc.finalproject.NicksAngelsParsells.dto.UserDTO;
import com.csb.appadvc.finalproject.NicksAngelsParsells.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){
        return "index";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
