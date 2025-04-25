package com.xworkz.gymapp.runner;

import com.xworkz.gymapp.constant.MembershipType;
import com.xworkz.gymapp.dto.GymMemebershipDetailsDto;
import com.xworkz.gymapp.repository.GymMembershipRepository;
import com.xworkz.gymapp.repository.GymMembershipRepositoryImpl;
import com.xworkz.gymapp.service.GymMembershipService;
import com.xworkz.gymapp.service.GymMembershipServiceImplementation;

public class GymMembershipRunner {
    public static void main(String[] args) {
        GymMemebershipDetailsDto dto = new GymMemebershipDetailsDto();
        dto.setMemeberId(1);
        dto.setMemeberName("your name");
        dto.setMemberEmailId("yourname@gmail.com");

        // Set only one membership type, or modify your DTO to accept multiple
        dto.setMembershipType(MembershipType.YEARLY);

        System.out.println(dto.getMemeberId());
        System.out.println(dto.getMemeberName());
        System.out.println(dto.getMemberEmailId());
        System.out.println(dto.getClass());
        System.out.println(dto.toString());

        // Repository and Service
        GymMembershipRepository  gymMembershipRepository = new GymMembershipRepositoryImpl();

        GymMembershipService service = new GymMembershipServiceImplementation(gymMembershipRepository);
        service.validateDto(dto);
    }
}
