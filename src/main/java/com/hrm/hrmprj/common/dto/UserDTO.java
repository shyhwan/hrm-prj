package com.hrm.hrmprj.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDao {

    private String userId;  // 사원번호
    private String userName;  // 이름
    private String team;  // 팀
    private String position;  // 직급
    private String role;  // 권한
    private String email;  // 이메일
    private String phoneNumber;  // 휴대전화번호
    private String address;  // 주소
}
