package com.hrm.hrmprj.biz.user.service.impl;

import com.hrm.hrmprj.biz.user.service.UserService;
import com.hrm.hrmprj.common.dao.UserMapper;
import com.hrm.hrmprj.common.dto.UserDTO;
import com.hrm.hrmprj.common.entity.UserEntity;
import com.hrm.hrmprj.common.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    /*
    @Override
    public UserDTO getUserById(Long id) {
        UserEntity userEntity = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return userMapper.toDto(userEntity);
    }
    */

    @Override
    public UserDTO getUserById(Long id) {
        UserEntity userEntity = findUserById(id);
        return userMapper.toDto(userEntity);
    }

    private UserEntity findUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    /*
    @Override
    public List<UserDTO> getAllUsers() {
        List<UserDTO> userList = new ArrayList<>();
        *//*
        userRepository.findAll().stream().map(userMapper::toDto)
                .collect(Collectors.toList());
        *//*
        userRepository.findAll().forEach(userEntity -> userList.add(userMapper.toDto(userEntity)));
        return userList;
    }
    */

    @Override
    public List<UserDTO> getAllUsers() {
        /*List<UserDTO> userList = allUsers();*/
        return allUsers();
    }

    private List<UserDTO> allUsers() {
        return userRepository.findAll().stream().map(userMapper::toDto)
                .collect(Collectors.toList());
    }

    /*
    @Override
    public void saveUser(UserDTO user) {
        UserEntity entity = userMapper.toEntity(userDTO);
        userRepository.save(entity);
    }
    */

    @Override
    public void saveUser(UserDTO user) {
        UserEntity userEntity = convertToEntity(user);
        saveUserEntity(userEntity);
    }

    private UserEntity convertToEntity(UserDTO userDTO) {
        return userMapper.toEntity(userDTO);
    }

    private void saveUserEntity(UserEntity userEntity) {
        userRepository.save(userEntity);
    }
}
