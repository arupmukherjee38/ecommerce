package com.tcs.library.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tcs.library.ecommerce.model.UserData;

public interface UserDataRepository extends JpaRepository<UserData, Long>{

}
