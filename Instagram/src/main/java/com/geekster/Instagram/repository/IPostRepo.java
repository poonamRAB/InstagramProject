package com.geekster.Instagram.repository;

import com.geekster.Instagram.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPostRepo extends JpaRepository<Post,Integer> {
}
