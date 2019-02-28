package com.example.web;

import com.example.comm.Para;
import com.example.dao.UserRepository;
import com.example.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {
    @Resource
    UserRepository userRepository;
    @RequestMapping("/list")
    public List<User> findAll(){
        return userRepository.findAll();
    }
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public Page<User> findByPage(@RequestBody Para para){
        int page =para.getPage(),size=para.getSize();
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(page,size,sort);
        return  userRepository.findAll(pageable);
        //userRepository.findByNickName("cc",pageable);
    }

}
