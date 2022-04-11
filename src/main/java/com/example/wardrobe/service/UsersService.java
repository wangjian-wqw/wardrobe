package com.example.wardrobe.service;

import com.example.wardrobe.entity.Users;

import java.util.List;

/**
 * @author Tom.wang
 * @date 2022/4/11 14:16
 */
public interface UsersService {
    List<Users> findAll();
}
