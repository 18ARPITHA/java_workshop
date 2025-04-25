package com.xworkz.meetup.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configurable
@ComponentScan("com.xworkz")
public class MeetUpConfiguration implements WebMvcConfigurer {

    public MeetUpConfiguration(){
        System.out.println("MeetUpConfiguration created");
    }
}
