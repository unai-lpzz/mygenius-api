package com.gen.gapi_2.controller;

import com.gen.gapi_2.dto.GeniusSongDto;
import com.gen.gapi_2.model.GeniusArtist;
import com.gen.gapi_2.service.GeniusArtistService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/private")
public class GeniusArtistController {

    private final GeniusArtistService geniusArtistService;

    @GetMapping("/artists/{id}")
    public GeniusArtist getArtistById(@PathVariable("id") Long id){
        return geniusArtistService.getArtistById(id);
    }

    @GetMapping("/artists/{id}/songs")
    public List<GeniusSongDto> getSongsByArtistId(@PathVariable("id") Long id){
        return geniusArtistService.getPopularSongsByArtistId(id);
    }



}
