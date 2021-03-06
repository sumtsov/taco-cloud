package com.dsumtsov.tacocloud.repository.jpa;

import com.dsumtsov.tacocloud.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
