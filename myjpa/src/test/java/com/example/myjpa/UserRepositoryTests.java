package com.example.myjpa;

import com.example.dao.UserRepository;
import com.example.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {
    @Resource
    private UserRepository userRepository;
    @Test
    public void test() {
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
       /* userRepository.save(new User("dd", "dd@126.com", "dd", "dd123456", formattedDate));
        userRepository.save(new User("ee", "ee@126.com", "ee", "ee123456", formattedDate));
        userRepository.save(new User("ff", "ff@126.com", "ff", "ff123456", formattedDate));*/
       // userRepository.save(new User("gg", "gg@126.com", "gg", "gg123456", formattedDate));
        //userRepository.save(new User("qq", "qq@126.com", "qq", "qq123456", formattedDate));
       // userRepository.save(new User("ww", "ww@126.com", "ww", "ww123456", formattedDate));
        //Assert.assertEquals(8, userRepository.findAll().size());
        //Assert.assertEquals("bb123456", userRepository.findByUserNameOrEmail("bb", "cc@126.com").getNickName());
       // userRepository.delete(userRepository.findByUserName("aa"));
    }
    @Test
    public void testPageQuery(){
        int page =1,size=10;
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(page,size,sort);
        userRepository.findAll(pageable);
        userRepository.findByNickName("cc",pageable);
    }
    @Test
    public void testUpdate(){
        userRepository.modifyById("first",2L);
    }
}
