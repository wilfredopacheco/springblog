package com.codeup.springblog.services;

import com.codeup.springblog.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdsSvc {
    private List<Post> ads;

    public AdsSvc(){
        ads = new ArrayList<>();
    }

    public void createAds() {
        ads.add(new Post("a good day", "meh"));
        ads.add(new Post("a bad day", "meh again"));
    }
//    public Ad findOne(long id){
//        return ads.get((int) id -1);
//    }
}
