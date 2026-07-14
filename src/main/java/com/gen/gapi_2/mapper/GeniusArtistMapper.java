package com.gen.gapi_2.mapper;

import com.gen.gapi_2.dto.GeniusArtistDto;
import com.gen.gapi_2.model.GeniusArtist;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface GeniusArtistMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "image_url", target = "imageUrl")
    GeniusArtist toDomain(GeniusArtistDto dto);
}
