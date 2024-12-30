package com.hrm.hrmprj.biz.user.service;

import com.hrm.hrmprj.common.dto.UserDTO;

import java.util.List;

public interface UserService {

    /**
     *  사용자 조회
     *
     * @param id 사원번호
     * @return UserDTO
     */
    UserDTO getUserById(Long id);

    /**
     *  사용자 리스트 조회
     *
     * @return List UserDTO
     */
    List<UserDTO> getAllUsers();

    /**
     * 사용자 저장
     *
     * @param user 사용자 정보
     */
    void saveUser(UserDTO user);
}
