package com.example.miniproject.service;

import com.example.miniproject.dto.UserDTO;
import com.example.miniproject.exception.NotFoundException;
import com.example.miniproject.entiy.User;
import com.example.miniproject.repository.UserRepository;
import com.example.miniproject.request.LogInRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserDTO getUser(LogInRequest request) {
        List<User> uList = userRepository.getList();
        for (User user : uList) {
            if (user.getUsername().equals(request.getUsername()) && user.getPassword().equals(request.getPassword())) {
                return convertToDTO(user);
            }
        }
        throw new NotFoundException("username hoặc password chưa chính xác");
    }

    private UserDTO convertToDTO(User model) {
        UserDTO dto = new UserDTO();
        dto.setUsername(model.getUsername());
        dto.setEmail(model.getEmail());
        dto.setAvatar(model.getAvatar());
        return dto;
    }
}
