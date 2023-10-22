package com.jc.gymbasicsystem.application.services.interfaces;

import com.jc.gymbasicsystem.application.dto.CreateUserDto;
import com.jc.gymbasicsystem.domain.entities.UserEntity;

public interface IUserService {

    UserEntity createUser(CreateUserDto createUserDto);

}
