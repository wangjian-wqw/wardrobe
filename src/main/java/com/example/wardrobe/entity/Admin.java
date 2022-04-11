package com.example.wardrobe.entity;

import lombok.Data;

/**
 * @author Tom.wang
 * @date 2022/4/11 9:31
 */
@Data
public class Admin {
    private String admin_id;
    private String admin_name;
    private String admin_password;
    private String secret_key;
}
