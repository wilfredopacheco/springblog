package com.codeup.springblog.services;

import com.codeup.springblog.models.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<Users, Long> {

}
