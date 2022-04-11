package com.example.wardrobe.service.Impl;

import com.example.wardrobe.entity.Admin;
import com.example.wardrobe.mapper.AdminMapper;
import com.example.wardrobe.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tom.wang
 * @date 2022/4/11 10:29
 */
@Service
@Slf4j
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public String updateAdminService(Admin admin) {
        int i = adminMapper.updateAdmin(admin);
        if (i > 0){
            return "修改成功";
        }
        return "修改失败";
    }

    @Override
    public List<Admin> findMeService(String secret_key) {
        log.info("获取到的密钥是 - " + secret_key);
        List<Admin> adminList = adminMapper.getAdminInfo(secret_key);
        return adminList;
    }

    @Override
    public String deleteSelf(String secret_key) {
        log.info("获取到的密钥是 - " + secret_key);
        int i = adminMapper.deleteSelf(secret_key);
        if (i > 0){
            return "删除成功";
        }
        return "删除失败";
    }
}
