package com.car_rental.car_rental.controller;

import org.springframework.web.bind.annotation.RestController;

import com.car_rental.car_rental.dto.SignUpRequest;
import com.car_rental.car_rental.dto.UserDto;
import com.car_rental.car_rental.services.auth.AuthService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<?> signupCustomer(@RequestBody SignUpRequest signUpRequest){
        UserDto createCustomerDto= authService.createCustomer(signUpRequest);
        if(createCustomerDto ==null) 
        return new ResponseEntity<>
        ("customer not created ,come back later",HttpStatus.BAD_REQUEST);

        return new ResponseEntity<>(createCustomerDto,HttpStatus.CREATED);

    }
    
    
}
