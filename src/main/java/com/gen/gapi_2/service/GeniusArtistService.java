package com.gen.gapi_2.service;

import com.gen.gapi_2.client.GeniusArtistClient;
import com.gen.gapi_2.dto.*;
import com.gen.gapi_2.mapper.GeniusArtistMapper;
import com.gen.gapi_2.model.GeniusArtist;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GeniusArtistService {

    private final GeniusArtistClient geniusArtistClient;
    private final GeniusArtistMapper geniusArtistMapper;

    public GeniusArtist getArtistById(Long artistId) {
        var apiResponse = geniusArtistClient.getArtistById(artistId);
        GeniusArtistDto artistDto = apiResponse.response().artist();
        GeniusArtist artist = geniusArtistMapper.toDomain(artistDto);
        var songsResponse = geniusArtistClient.getPopularSongs(artistId);
        List<GeniusSongDto> songsDtoList = songsResponse.response().songs();
        List<String> songTitles = songsDtoList.stream()
                .map(GeniusSongDto::getTitle)
                .toList();
        artist.setPopularSongs(songTitles);
        return artist;
    }

    public List<GeniusSongDto> getPopularSongsByArtistId(Long artistId) {
        var apiResponse = geniusArtistClient.getPopularSongs(artistId);
        return apiResponse.response().songs();
    }

}
