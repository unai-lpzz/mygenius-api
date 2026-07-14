package com.gen.gapi_2.client;

import com.gen.gapi_2.dto.ArtistResponseWrapper;
import com.gen.gapi_2.dto.GeniusApiResponse;
import com.gen.gapi_2.dto.GeniusSongDto;
import com.gen.gapi_2.dto.SongsResponseWrapper;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange("/artists")
public interface GeniusArtistClient {
    @GetExchange("/{id}")
    GeniusApiResponse<ArtistResponseWrapper> getArtistById(@PathVariable("id") Long id);

    @GetExchange("/{id}/songs?sort=popularity&per_page=10")
    GeniusApiResponse<SongsResponseWrapper> getPopularSongs(@PathVariable("id") Long id);

}
