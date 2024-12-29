package com.hrm.hrmprj.biz.user.service.impl;

import com.hrm.hrmprj.common.dto.UserDTO;

import java.util.List;

public interface UserService {

    UserDTO getUserById(Long id);

    List<UserDTO> getAllUsers();

    void saveUser(UserDTO user);
}
