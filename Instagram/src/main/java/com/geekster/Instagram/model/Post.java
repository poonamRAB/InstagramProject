package com.geekster.Instagram.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;

    private Timestamp createdDate;

    private Timestamp updatedDate;

    private String data;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
