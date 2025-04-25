package com.xworkz.gymapp.dto;

import com.xworkz.gymapp.constant.MembershipType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
@Setter
@Getter

public class GymMemebershipDetailsDto {

    //properties or instance variables

    private int memeberId;
    private String memeberName;
    private  String memberEmailId;
    private long conatactNumber;
    private LocalDate issueddate;
    private LocalTime issuedTime;
    private LocalDate expDate;
    private MembershipType membershipType;


   //provide the getter and setter methods






}
