package com.codewitharjun.fullstackbackend.repository;

import com.codewitharjun.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

//User is the name from the model class, 2nd parameter is the datatype of the primary key 'id'
public interface UserRepository extends JpaRepository<User, Long> {

}
