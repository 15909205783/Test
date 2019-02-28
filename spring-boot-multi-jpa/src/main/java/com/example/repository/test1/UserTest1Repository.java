package com.example.repository.test1;

import com.example.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTest1Repository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username,String email);
}
