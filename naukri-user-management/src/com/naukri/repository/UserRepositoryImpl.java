package com.naukri.repository;

import com.naukri.dto.UserDTO;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private List<UserDTO> users = new ArrayList<>();

    @Override
    public boolean save(UserDTO dto) {
        return users.add(dto);
    }

    @Override
    public List<UserDTO> getAll() {
        return users;
    }

    @Override
    public UserDTO findByEmail(String email) {
        for (UserDTO user : users) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }
}
