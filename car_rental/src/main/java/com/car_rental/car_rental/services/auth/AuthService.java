package com.car_rental.car_rental.services.auth;

import com.car_rental.car_rental.dto.SignUpRequest;
import com.car_rental.car_rental.dto.UserDto;

public interface AuthService {
    UserDto createCustomer(SignUpRequest signUpRequest);
}
