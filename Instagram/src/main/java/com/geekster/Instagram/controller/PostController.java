package com.geekster.Instagram.controller;

import com.geekster.Instagram.model.Post;
import com.geekster.Instagram.service.PostService;
import org.hibernate.validator.constraints.CodePointLength;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class PostController {
    @Autowired
    PostService postService;

    //save post
    @PostMapping("/post")
    public Post savePost(@RequestBody Post post){
        return postService.savePost(post);
    }

    //get post
    @GetMapping("/post")

    public List<Post> getPost(){
        return postService.getAllPost();
    }
}
