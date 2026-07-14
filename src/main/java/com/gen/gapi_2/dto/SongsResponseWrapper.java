package com.gen.gapi_2.dto;

import java.util.List;

public record SongsResponseWrapper(
        List<GeniusSongDto> songs
) {}
