package com.naukri.runner;

import com.naukri.dto.UserDTO;
import com.naukri.repository.UserRepository;
import com.naukri.repository.UserRepositoryImpl;
import com.naukri.service.UserService;
import com.naukri.service.UserServiceImpl;

public class NaukriRunner {
    public static void main(String[] args) {
        UserRepository repo = new UserRepositoryImpl();
        UserService service = new UserServiceImpl(repo);

        UserDTO u1 = new UserDTO(1, "xyx", "ash@gmail.com", "Java");
        UserDTO u2 = new UserDTO(2, "abc", "jill@xyz.com", "Python");


        service.validateAndSave(u1);
        service.validateAndSave(u2);

        System.out.println("=== All Users ===");
        service.displayAll();

        System.out.println("=== Search User ===");
        service.searchByEmail("ash@gmail.com");
    }
}

