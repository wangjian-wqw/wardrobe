package com.example.wardrobe.controller;

import com.example.wardrobe.entity.Users;
import com.example.wardrobe.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Tom.wang
 * @date 2022/4/11 14:01
 */
@RestController
@Slf4j
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersService usersService;

    @GetMapping("/findAll")
    public List<Users> findAll(){
        return usersService.findAll();
    }
}
