package com.car_rental.car_rental.services.auth;

import org.springframework.stereotype.Service;

import com.car_rental.car_rental.dto.SignUpRequest;
import com.car_rental.car_rental.dto.UserDto;
import com.car_rental.car_rental.entity.User;
import com.car_rental.car_rental.enums.UserRole;
import com.car_rental.car_rental.repository.UserRespository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    private final UserRespository userRespository;

    @Override
    public UserDto createCustomer(SignUpRequest signUpRequest){
        User user= new User();
        user.setName(signUpRequest.getName());
        user.setEmail(signUpRequest.getEmail());
        user.setPassword(signUpRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser=userRespository.save(user);
        UserDto userDto =new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }
}
