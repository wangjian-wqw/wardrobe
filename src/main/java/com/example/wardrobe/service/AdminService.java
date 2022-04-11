package com.example.wardrobe.service;

import com.example.wardrobe.entity.Admin;

import java.util.List;

/**
 * @author Tom.wang
 * @date 2022/4/11 10:23
 */
public interface AdminService {
    public String updateAdminService(Admin admin);

    List<Admin> findMeService(String secret_key);

    String deleteSelf(String secret_key);
}
