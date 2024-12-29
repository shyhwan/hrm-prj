package com.hrm.hrmprj.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name="TB_USER_INFO")
public class UserEntity {

    @Id
    @Column(name="USER_ID", length = 10)
    private String userId;

    @Column(name="USER_NM", length = 25, nullable = false, unique = true)
    private String userName;

    @Column(name="USER_PSWD", length = 255, nullable = false)
    private String userPswd;

    @Column(name="USER_TEAM", length = 50, nullable = false)
    private String userTeam;

    @Column(name="USER_POSITION", length = 50, nullable = false)
    private String userPosition;

    @Column(name="USER_AUTH", length = 50, nullable = false)
    private String userAuth;

    @Column(name="EMAIL", length = 255)
    private String email;

    @Column(name="PHONE_NUMBER", length = 15)
    private String phoneNumber;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="BIRTH_YMD", length = 8)
    private String birthYmd;

    @Column(name="JOIN_YMD", length = 8)
    private String joinYmd;

    @Column(name="RESIGN_YMD", length = 8)
    private String resignYmd;

    @Column(name="RESIGN", length = 1)
    private String resign;

    @Column(name="LAST_LOGIN")
    private LocalDateTime lastLogin;

    @Column(name="FAILED_LOGIN_ATTEMPTS", length = 1)
    private int failedLoginAttempts;

    @Column(name="CREATED_AT", updatable = false)
    private LocalDateTime createdAt;

    @Column(name="UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name="DELETED_AT")
    private LocalDateTime deletedAt;
}
