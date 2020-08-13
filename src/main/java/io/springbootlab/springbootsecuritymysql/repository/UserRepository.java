package io.springbootlab.springbootsecuritymysql.repository;


import io.springbootlab.springbootsecuritymysql.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);

}
