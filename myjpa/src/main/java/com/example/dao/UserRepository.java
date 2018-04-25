package com.example.dao;

import com.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);
    @Query("SELECT u from User u")
    Page<User> findAll(Pageable pageable);
    Page<User> findByNickName(String nickName,Pageable pageable);

    @Transactional(timeout = 10)
    @Modifying
    @Query("UPDATE User set userName = ?1 where  id= ?2")
    int modifyById(String useName,Long id);
}
