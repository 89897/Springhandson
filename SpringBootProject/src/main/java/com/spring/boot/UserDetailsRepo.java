package com.spring.boot;

import org.springframework.data.repository.CrudRepository;

public interface UserDetailsRepo extends CrudRepository<UserDetails, Integer>{
}
