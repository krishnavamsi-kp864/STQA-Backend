package com.krishna.app.rest.Repo;

import com.krishna.app.rest.Models.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LoginuserRepo extends JpaRepository<LoginUser, Long> {

    Optional<LoginUser> findByUsernameAndPassword(String username, String password);
}
