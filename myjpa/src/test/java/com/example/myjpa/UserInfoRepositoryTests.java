package com.example.myjpa;

import com.example.dao.UserDetailRepository;
import com.example.entity.UserDetail;
import com.example.result.UserInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoRepositoryTests {
    @Resource
    private UserDetailRepository userDetailRepository;
    @Test
    public void testSave(){
        userDetailRepository.save(new UserDetail(1L,"aa","足球"));
        Assert.assertEquals(1,userDetailRepository.findAll().size());
    }
    @Test
    public void testUserInfo(){
        List<UserInfo> userInfos = userDetailRepository.findUserInfo("足球");
        for (UserInfo userInfo:userInfos) {
            System.out.print("addree"+userInfo.getAddress());
        }

    }

}
