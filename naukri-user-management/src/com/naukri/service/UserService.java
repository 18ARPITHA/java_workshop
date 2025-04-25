package com.naukri.service;

import com.naukri.dto.UserDTO;

public interface UserService {
    boolean validateAndSave(UserDTO dto);
    void displayAll();
    void searchByEmail(String email);
}
