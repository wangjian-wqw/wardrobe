package com.example.wardrobe.mapper;

import com.example.wardrobe.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Tom.wang
 * @date 2022/4/11 10:32
 */
@Mapper
@Repository
public interface AdminMapper {
    int updateAdmin(Admin admin);

    List<Admin> getAdminInfo(String secret_key);

    int deleteSelf(String secret_key);
}
