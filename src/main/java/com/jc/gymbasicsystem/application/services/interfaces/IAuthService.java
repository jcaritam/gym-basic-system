package com.jc.gymbasicsystem.application.services.interfaces;

import com.jc.gymbasicsystem.application.dto.CreateUserDto;
import com.jc.gymbasicsystem.application.dto.auth.AuthenticationResponse;
import com.jc.gymbasicsystem.application.dto.auth.UserCredentialsDto;

public interface IAuthService {

    AuthenticationResponse login(UserCredentialsDto userCredentialsDto);

    AuthenticationResponse register(CreateUserDto createUserDto);
}
