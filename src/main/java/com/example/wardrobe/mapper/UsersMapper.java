package com.example.wardrobe.mapper;

import com.example.wardrobe.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Tom.wang
 * @date 2022/4/11 14:19
 */
@Mapper
@Repository
public interface UsersMapper {
    List<Users> getAllUsers();
}
