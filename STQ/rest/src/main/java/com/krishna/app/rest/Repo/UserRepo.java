package com.krishna.app.rest.Repo;

import com.krishna.app.rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepo extends JpaRepository<User, Long> {


//    List<User> findbyId(int  id);
}
