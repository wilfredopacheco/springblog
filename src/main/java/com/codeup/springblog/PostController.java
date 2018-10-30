package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
public class PostController {

    List<Post> posts = new ArrayList<>();

    @GetMapping("/posts")
    public String postIndex(Model vModel) {
        posts.add(new Post("a good day", "meh"));
        posts.add(new Post("a bad day", "meh again"));

        vModel.addAttribute("posts", posts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String individualPost(@PathVariable int id, Model vModel){
        vModel.addAttribute("post", posts.get(id-1));
        return "posts/show";
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
