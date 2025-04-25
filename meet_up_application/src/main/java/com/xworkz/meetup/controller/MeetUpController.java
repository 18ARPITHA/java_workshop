package com.xworkz.meetup.controller;

import com.xworkz.meetup.dto.MeetupDetalisDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;
import java.time.LocalDateTime;

@RequestMapping("/")
@Controller
public class MeetUpController {
    public MeetUpController(){
        System.out.println("meetupcontroller created");
    }
//get and post method
    @PostMapping("/submit")
public String acceptPostMethod(@ModelAttribute MeetupDetalisDto dto){
        System.out.println("acceptedPostMethod() invoked");
        dto.setCreatedBy("your name");
        dto.setCreatedOn(LocalDateTime.now());
        System.out.println("dto is:"+dto);
        //save data


        //
        return "sucess.jsp";
}

@GetMapping("/submit")
    public String acceptGetMethod(){
        System.out.println("acceptedGetMethod() invoked");
        return "sucess.jsp";
}
}
