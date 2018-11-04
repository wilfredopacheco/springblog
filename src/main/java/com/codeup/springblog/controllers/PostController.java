package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.services.PostSvc;
import com.codeup.springblog.services.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PostController {
    private final PostSvc postSvc;

    @Autowired
    private UserRepo userRepo;

    //Dependency Injection
    public PostController(PostSvc postSvc){
        this.postSvc = postSvc;
    }

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
        post.setUser(userRepo.findOne(1L));
        Post savedPost = postSvc.createPost(post);
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

    @GetMapping("/posts/search/{term}")
    public String showResults(@PathVariable String term, Model vModel){
        vModel.addAttribute("post", postSvc.search(term, term));
        return "post/index";
    }
    @GetMapping("/posts/{id}/update/delete")
    public String deletePost(@PathVariable int id) {
        postSvc.deletePost(id);
        return "redirect:/posts";
    }



}
