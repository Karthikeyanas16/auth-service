package com.lti.mod.services.authservice.repository;

import com.lti.mod.services.authservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String name);

  //  Optional<User> findByEmail(String email);
    @Query(value = "SELECT * from User e where e.email =:email and e.status='0'", nativeQuery = true)
    Optional<User> findByEmail(@Param("email") String email);



}
