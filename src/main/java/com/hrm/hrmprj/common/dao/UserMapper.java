package com.hrm.hrmprj.common.dao;

import com.hrm.hrmprj.common.dto.UserDTO;
import com.hrm.hrmprj.common.entity.UserEntity;
import org.mapstruct.Mapping;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
/*
    @Mapping(source = "userId", target = "userId")
    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "team", target = "team")
    @Mapping(source = "position", target = "position")
    @Mapping(source = "role", target = "role")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    @Mapping(source = "address", target = "address")*/
    UserDTO toDto(UserEntity userEntity);
/*
    @Mapping(source = "userId", target = "userId")
    @Mapping(source = "userName", target = "userName")
    @Mapping(source = "team", target = "team")
    @Mapping(source = "position", target = "position")
    @Mapping(source = "role", target = "role")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "phoneNumber", target = "phoneNumber")
    @Mapping(source = "address", target = "address")*/
    UserEntity toEntity(UserDTO userDTO);
}
