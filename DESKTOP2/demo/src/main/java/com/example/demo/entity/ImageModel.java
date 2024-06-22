package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class ImageModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @JsonIgnore
    private Long userId;
    @JsonIgnore
    private Long postId;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] imageBytes;

}
