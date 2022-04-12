package com.baomidou.mybatisplus.samples.quickstart.mapper;

import com.baomidou.mybatisplus.samples.quickstart.model.T_User;

public interface T_UserMapper {
    int insert(T_User record);

    int insertSelective(T_User record);
}