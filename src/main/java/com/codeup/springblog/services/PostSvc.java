package com.codeup.springblog.services;

import com.codeup.springblog.Post;
import java.util.ArrayList;
import java.util.List;

public class PostSvc {
    List<Post> posts;

    public PostSvc(){
        posts = new ArrayList<>();
        createPost();
    }

    public Post getSinglePost(long id){
        return posts.get((int) id - 1);
    }

    public List<Post> getAll(){
        return posts;
    }

    public Post savePost(Post post){
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    private void createPost(){
        this.savePost(new Post("a good day", "meh"));
        this.savePost(new Post("a bad day", "meh again"));
        this.savePost(new Post("a good and bad day", "this week has been so meh."));
    }

    public Post update(Post post){
        return posts.set((int) post.getId() - 1, post);
    }

}
