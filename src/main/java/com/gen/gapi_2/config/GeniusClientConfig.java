package com.gen.gapi_2.config;

import com.gen.gapi_2.client.GeniusArtistClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class GeniusClientConfig {
    @Value("${api.genius.base-url}")
    private String baseUrl;

    @Value("${api.genius.token}")
    private String token;

    @Bean
    public HttpServiceProxyFactory factory(){
        RestClient restClient = RestClient.builder()
                .baseUrl(baseUrl)
                .defaultHeaders(headers -> headers.setBearerAuth(token))
                .build();
        RestClientAdapter adapter = RestClientAdapter.create(restClient);
        return HttpServiceProxyFactory.builderFor(adapter).build();
    }

    @Bean
    public GeniusArtistClient geniusArtistClient(HttpServiceProxyFactory factory){
        return factory.createClient(GeniusArtistClient.class);
    }
}
