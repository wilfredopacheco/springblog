package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String landing(){
        return"home";
    }
    @GetMapping("/home")
    public String hello(){
        return "home";
    }

    @GetMapping("/hello/{name}")
    public String showHello(@PathVariable String name, Model viewModel){
        viewModel.addAttribute("name", name.toUpperCase());
        return "home";
    }

    @GetMapping("/users")
    public String showUsers(Model vModel){
        List<String> users = new ArrayList<>();
        users.add("Wil");
        users.add("Daniel");
        users.add("Justin");
        vModel.addAttribute("users", users);
        return "users";
    }

}
