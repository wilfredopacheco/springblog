package com.codeup.springblog.controllers;

import com.codeup.springblog.Post;
import com.codeup.springblog.services.PostSvc;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {
    PostSvc postSvc = new PostSvc();

    @GetMapping("/posts")
    public String postIndex(Model vModel) {
        vModel.addAttribute("posts", postSvc.getAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", postSvc.getSinglePost(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showPostForm(Model vModel){
        vModel.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")
    public String createPost(@ModelAttribute Post post){
        Post savedPost = postSvc.savePost(post);
        return "redirect:/posts/" + savedPost.getId();
    }

    @GetMapping("/posts/{id}/update")
    public String showEditForm(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", postSvc.getSinglePost(id));
        return "posts/update";
    }

    @PostMapping("/posts/{id}/update")
    public String showUpdateForm(@ModelAttribute Post post){
        Post updatePost = postSvc.update(post);
        return "redirect:/posts/" + updatePost.getId();
    }



}
