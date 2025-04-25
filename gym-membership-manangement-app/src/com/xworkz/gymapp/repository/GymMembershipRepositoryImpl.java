package com.xworkz.gymapp.repository;

import com.xworkz.gymapp.dto.GymMemebershipDetailsDto;

public class GymMembershipRepositoryImpl {
    public class GymMembershipRepositoryImpl implements GymMembershipRepository {

        //
        private GymMemebershipDetailsDto[] listofDtos=new GymMemebershipDetailsDto[2];
        private int index=0;


        @Override

        public boolean saveDto(GymMemebershipDetailsDto dto) {
            System.out.println("Invoking the gymmembershipRepositoryimpl()");
            System.out.println("dto is: " + dto);
            if(this.index< listofDtos.length ){
                this.index++;
                System.out.println("Svaed successfully");
                return true;

            }
            else {
                System.out.println("check array length or array is full");
            }

            return true;
        }

        @Override
        public void readDtos(){
            System.out.println(Arrays.toString(listofDtos));
        }
    }
}
