package com.wuche.start;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.wuche.controller")
public class AppStart {
    public static void main(String[] args){
        SpringApplication.run(AppStart.class,args);
    }

}
