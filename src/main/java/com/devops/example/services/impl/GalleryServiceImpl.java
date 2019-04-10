package com.devops.example.services.impl;

import com.devops.example.models.Gallery;
import com.devops.example.services.GalleryService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GalleryServiceImpl implements GalleryService {

    private static final List<String> DEFAULT_PHOTOS = Arrays.asList(
        "photo-01.jpg",
        "photo-02.jpg",
        "photo-03.jpg",
        "photo-04.jpg",
        "photo-05.jpg",
        "photo-06.jpg"
    );

    @Override
    public Gallery getGallery() {
        return Gallery.builder()
            .title("Gallery")
            .text("Who are the people in the photos?")
            .photos(DEFAULT_PHOTOS)
            .build();
    }

}
