package com.example.repository;

import com.example.domain.User;
import com.example.repository.test1.UserTest1Repository;
import com.example.repository.test2.UserTest2Repository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTests {

    @Resource
    private UserTest1Repository userTest1Repository;
    @Resource
    private UserTest2Repository userTest2Repository;
    @Test
    public void testSave() throws Exception{
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String formattedDate = dateFormat.format(date);
        //userTest1Repository.save(new User("aa","aa123456","aa@126.com","aa",formattedDate));
        //userTest1Repository.save(new User("bb","bb123456","bb@126.com","bb",formattedDate));
       // userTest2Repository.save(new User("cc","cc123456","cc@126.com","cc",formattedDate));
        //userTest1Repository.save(new User("cc","cc123456","cc@126.com","cc",formattedDate));
       // userTest2Repository.save(new User("aa","aa123456","aa@126.com","aa",formattedDate));
        //userTest1Repository.save(new User("dd","dd123456","dd@126.com","dd",formattedDate));
       // userTest2Repository.save(new User("dd","dd123456","dd@126.com","dd",formattedDate));
        userTest1Repository.save(new User("ee","ee123456","ee@126.com","ee",formattedDate));
        userTest2Repository.save(new User("ee","ee123456","ee@126.com","ee",formattedDate));
    }
    @Test
    public void testBaseQuery() throws  Exception{
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
        String formatted = dateFormat.format(date);
        User user = new User("ff","ff123456","ff@126.com","ff",formatted);
        List<User> users = userTest1Repository.findAll();
        for (User user1:users) {
            System.out.println(user1.getUserName());
        }
        System.out.println(userTest2Repository.findOne(1L).getEmail());

        userTest2Repository.save(user);
        user.setId(21L);
       userTest1Repository.delete(user);
       System.out.println(userTest1Repository.count());
       System.out.println(userTest2Repository.exists(3L));
    }

}
