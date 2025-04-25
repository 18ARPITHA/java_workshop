package com.naukri.repository;

import com.naukri.dto.UserDTO;
import java.util.List;

public interface UserRepository {
    boolean save(UserDTO dto);
    List<UserDTO> getAll();
    UserDTO findByEmail(String email);
}
