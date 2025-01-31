package com.hrm.hrmprj.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {

    private String userId;  // 사원번호
    private String userPswd;  // 사원번호

    private boolean loginYn = false;  // 로그인 여부(true/false)
    private boolean managerYn = false;  // 관리자 여부(true/false)
}
