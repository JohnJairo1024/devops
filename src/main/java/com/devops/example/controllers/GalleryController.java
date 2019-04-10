package com.devops.example.controllers;

import com.devops.example.models.Gallery;
import com.devops.example.services.GalleryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class GalleryController {

    private final GalleryService service;

    @Autowired
    public GalleryController(GalleryService service) {
        this.service = service;
    }

    @CrossOrigin
    @RequestMapping(value = "/gallery", method = GET)
    public Gallery getGallery() {
        return service.getGallery();
    }

}
