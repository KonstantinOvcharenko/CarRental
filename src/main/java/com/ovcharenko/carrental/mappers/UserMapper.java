package com.ovcharenko.carrental.mappers;

import com.ovcharenko.carrental.dtos.UserDTO;
import com.ovcharenko.carrental.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    public UserDTO toDto(User user) {

        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        return dto;
    }

    public User toUser(UserDTO userDTO) {

        User user = new User();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        return user;
    }
}
