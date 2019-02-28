package com.example.web;

import com.example.dao.UserDetailRepository;
import com.example.result.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserDetailInfo {
    @Resource
    private UserDetailRepository userDetailRepository;

    @RequestMapping("/userDetail")
    public List<UserInfo> getUserDetailInfo() {
        return userDetailRepository.findUserInfo("足球");
    }
}
