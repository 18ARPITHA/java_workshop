package com.xworkz.gymapp.service;

import com.xworkz.gymapp.dto.GymMemebershipDetailsDto;
import com.xworkz.gymapp.repository.GymMembershipRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GymMembershipServiceImplementation implements GymMembershipService{

    private GymMembershipRepository gymMembershipRepository;
    @Override
    public  boolean validateDto(GymMemebershipDetailsDto dto) {
        if (dto != null) {
            System.out.println("dto is not null we can save the data");
            boolean saveResult= gymMembershipRepository.saveDto(dto);
            return saveResult;
        }
        return true;
    }

    @Override
    public void  readDto(){
        this.gymMembershipRepository.readDto();
    }
}

