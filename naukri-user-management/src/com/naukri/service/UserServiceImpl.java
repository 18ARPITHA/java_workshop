package com.naukri.service;

import com.naukri.dto.UserDTO;
import com.naukri.repository.UserRepository;
import java.util.regex.Pattern;

public class UserServiceImpl implements UserService {
    private UserRepository repo;

    public UserServiceImpl(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public boolean validateAndSave(UserDTO dto) {
        if (dto.getName() == null || dto.getName().length() < 3) {
            System.out.println("Invalid name");
            return false;
        }

        if (!Pattern.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$", dto.getEmail())) {
            System.out.println("Invalid email");
            return false;
        }

        return repo.save(dto);
    }

    @Override
    public void displayAll() {
        for (UserDTO user : repo.getAll()) {
            System.out.println(user);
        }
    }

    @Override
    public void searchByEmail(String email) {
        UserDTO user = repo.findByEmail(email);
        if (user != null) {
            System.out.println("Found: " + user);
        } else {
            System.out.println("User not found");
        }
    }
}
