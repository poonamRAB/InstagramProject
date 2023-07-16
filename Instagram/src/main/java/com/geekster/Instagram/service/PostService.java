package com.geekster.Instagram.service;

import com.geekster.Instagram.model.Post;
import com.geekster.Instagram.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    IPostRepo postRepo;

    public Post savePost(Post post) {

        return postRepo.save(post);

    }

    public List<Post> getAllPost() {
        return postRepo.findAll();
    }
}
