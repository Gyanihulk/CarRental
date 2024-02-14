package com.car_rental.car_rental.repository;


import org.springframework.stereotype.Repository;
import com.car_rental.car_rental.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;;
@Repository
public interface UserRespository extends JpaRepository<User,Long> {
    
}
