package com.devops.example.models;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Builder
public final class Gallery {

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String text;

    @Getter
    @Setter
    private List<String> photos;

}
