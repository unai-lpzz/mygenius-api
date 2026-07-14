package com.gen.gapi_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GApi2Application {

    public static void main(String[] args) {
        SpringApplication.run(GApi2Application.class, args);
    }

}
