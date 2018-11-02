package com.codeup.springblog.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="user_posts")
public class UserPosts {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private List<Post> posts;

    @ManyToOne
    @JoinColumn(name = "id")
    private Users users;
}
