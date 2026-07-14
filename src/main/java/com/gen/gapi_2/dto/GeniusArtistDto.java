package com.gen.gapi_2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeniusArtistDto {
    private Long id;
    private String name;
    private String image_url;
}
