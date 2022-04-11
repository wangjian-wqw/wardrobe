package com.example.wardrobe.service.Impl;

import com.example.wardrobe.entity.Users;
import com.example.wardrobe.mapper.UsersMapper;
import com.example.wardrobe.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tom.wang
 * @date 2022/4/11 14:16
 */
@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersMapper usersMapper;

    @Override
    public List<Users> findAll() {
        return usersMapper.getAllUsers();
    }
}
