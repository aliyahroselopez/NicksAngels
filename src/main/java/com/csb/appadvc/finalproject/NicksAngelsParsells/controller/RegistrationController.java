package com.csb.appadvc.finalproject.NicksAngelsParsells.controller;

import com.csb.appadvc.finalproject.NicksAngelsParsells.dto.UserDTO;
import com.csb.appadvc.finalproject.NicksAngelsParsells.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = {"/registered"})
public class RegistrationController {

    private static final String CUSTOMER_ROLE = "ROLE_CUSTOMER";

    @Autowired
    private UserService UserService;

    @GetMapping
    private String list(Model model) {
        model.addAttribute("user", new UserDTO());
        return "login";
    }

    @GetMapping("/add")
    private String getUserRegisterForm(Model model) {
        model.addAttribute("user", new UserDTO());
        return "login";
    }

    @PostMapping
    private String register(UserDTO user, Model model) {
        UserService.add(user);
        return list(model);
    }

    @GetMapping("/{id}")
    private String getUser(@PathVariable Long id, Model model) {
        model.addAttribute("user", UserService.get(id));
        return "login";
    }

    @PutMapping
    private String updateUser(UserDTO user, Model model) {
        UserService.update(user);
        return list(model);
    }

    @DeleteMapping
    private String deleteUser(UserDTO user, Model model) {
        UserService.delete(user.getId());
        return list(model);
    }


}
