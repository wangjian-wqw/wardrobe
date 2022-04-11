package com.example.wardrobe.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author Tom.wang
 * @date 2022/4/11 9:54
 */
@Data
public class Devices {
    private String device_id;
    private String device_tem;
    private String device_hem;
    /** 烟雾报警器是否在工作*/
    private Integer device_smoke;
    private Date device_time;
}
