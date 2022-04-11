package com.example.wardrobe.controller;

import com.example.wardrobe.entity.Admin;
import com.example.wardrobe.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.View;
import java.util.List;

/**
 * @author Tom.wang
 * @date 2022/4/11 10:03
 */
@RestController
@CrossOrigin
@Validated
@RequestMapping("/admin")
@Slf4j
public class AdminController {
    @Autowired
    private AdminService adminService;

    /**
     * 修改管理员信息
     * @param ad
     * @return 返回修改成功或者失败
     */
    @PutMapping("/update")
    public String updateAdmin(@RequestBody Admin ad){
        log.info(ad.toString());
        String strAdmin = adminService.updateAdminService(ad);
        log.info(strAdmin);
        return strAdmin;
    }

    /**
     * 根据密钥查找管理员，如果未输入密钥，则查找全部
     * @param secret_key
     * @return
     */
    @GetMapping("/find")
    public List<Admin> findMe(@RequestParam(value = "secret_key",required = false) String secret_key){
        List<Admin> adminList = adminService.findMeService(secret_key);
        return adminList;
    }

    @DeleteMapping("deleteMe")
    public String deleteMe(@RequestParam("secret_key") String secret_key ){
        return adminService.deleteSelf(secret_key);
    }

    @RequestMapping(value = "/index")
    public ModelAndView jumpTest(){
        ModelAndView modelAndView = new ModelAndView("/index");
        return modelAndView;
    }

}
