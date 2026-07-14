package com.gen.gapi_2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeniusArtist {
    private String name;
    private String id;
    private String imageUrl;
    private List<String> popularSongs;
}
