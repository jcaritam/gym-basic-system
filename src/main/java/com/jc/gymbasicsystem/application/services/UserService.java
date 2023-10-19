package com.jc.gymbasicsystem.application.services;

import com.jc.gymbasicsystem.application.dto.CreateUserDto;
import com.jc.gymbasicsystem.domain.entities.UserEntity;
import com.jc.gymbasicsystem.domain.usercases.user.CreateUserUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private CreateUserUseCase createUserUseCase;

    public UserEntity createUser(CreateUserDto createUserDto) {
        return createUserUseCase.execute(createUserDto);
    }
}
