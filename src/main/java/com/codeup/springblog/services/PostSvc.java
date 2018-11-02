package com.codeup.springblog.services;

import com.codeup.springblog.models.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostSvc {
    private PostRepo postRepo;

    public PostSvc(PostRepo postRepo){
        this.postRepo = postRepo;
    }

    public Post getSinglePost(long id){
        return postRepo.findOne(id);
    }

    public Iterable<Post> getAll(){
        return postRepo.findAll();
    }

    public Post createPost(Post post){
        return postRepo.save(post);
    }

    public Post update(Post post){
        return postRepo.save(post);
    }

    public List<Post> search(String str, String ing) {
        return postRepo.findAllByOrBodyContains(str, ing);
    }

    public void deletePost(long id){
        postRepo.delete(id);

    }
}
