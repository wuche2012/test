package com.wuche.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@EnableEurekaServer
@SpringBootApplication
@RestController
public class EurekaServerApplication {


    @GetMapping(path = "/healthz",produces = MediaType.TEXT_PLAIN_VALUE)
    public String Healthz(){
        return "ok";
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
