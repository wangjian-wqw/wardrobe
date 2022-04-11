package com.example.wardrobe.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Tom.wang
 * @date 2022/4/11 9:48
 */
@Data
public class Users {
    private String users_id;
    private String device_id;
    private String users_name;
    private String users_password;
    /** 喜好的温度*/
    private String hobby_tem;
    /** 喜好的湿度*/
    private String hobby_hem;
    /**
     * 设备开关次数
     */
    private Integer es_times;
    /**
     * 最后一次更新时间
     */
    private Date update_time;
}
