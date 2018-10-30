package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String postIndex() {
        return "posts index page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String individualPost(@PathVariable String id){
        return "View an individual post id= " +id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public void createPost(@PathVariable String post){

    }


    @PostMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "create a new post";
    }



}
