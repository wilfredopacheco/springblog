package com.codeup.springblog.controllers;

import com.codeup.springblog.models.User;
import com.codeup.springblog.models.UserWithRoles;
import com.codeup.springblog.services.UserDetailsLoader;
import com.codeup.springblog.services.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


public class ProfileController {
//    private User user;
//
//    @Autowired
//    private UserRepo userRepo;
//
//    @GetMapping("/profile/{id}")
//    public String profile(@PathVariable int id, Model vModel){
//        User user = userRepo.findOne((long)id);
//        vModel.addAttribute("user", user);
//        return "users/profile";
//    }


}