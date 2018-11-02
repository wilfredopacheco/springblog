package com.codeup.springblog.services;

import com.codeup.springblog.models.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepo extends CrudRepository<Post, Long> {
    List<Post> findAllByOrBodyContains(String str, String ing);

//    @Query("from Post where title like %?1% or body like %?1%")
//    List<Post>searchByTitle(String term);

}
