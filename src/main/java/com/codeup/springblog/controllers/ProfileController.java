package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import com.codeup.springblog.services.PostSvc;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProfileController {
    private final PostSvc postSvc;

    public ProfileController(PostSvc postSvc){
        this.postSvc = postSvc;
    }

    @GetMapping("/profile")
    public String showProfile(Model vModel, Model pModel){
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        vModel.addAttribute("user", user);
        pModel.addAttribute("posts", postSvc.getAll());
        return "users/profile";
    }


}