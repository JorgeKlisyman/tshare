package com.techdevbrazil.tshare.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "posts_photos", schema = "TSHARE")
public class PostPhoto {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "posts_photos_sq")
    @SequenceGenerator(schema = "TSHARE", name = "posts_photos_sq", sequenceName = "posts_photos_sq", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "photo_name")
    private String photoName;

    private String url;

    @ManyToOne
    @JoinColumn(name = "posts_id")
    private Post post;


}
