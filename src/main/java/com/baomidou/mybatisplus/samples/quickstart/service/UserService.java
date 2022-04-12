package com.baomidou.mybatisplus.samples.quickstart.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.samples.quickstart.entity.User;
import com.baomidou.mybatisplus.samples.quickstart.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> queryWrapper(long id){
        QueryWrapper<User> objectQueryWrapper = new QueryWrapper<>();
       // objectQueryWrapper.eq("name","张三");
       /* if (!Objects.isNull(id)) {
            objectQueryWrapper.eq("id",id);
        }*/
        objectQueryWrapper.eq(!Objects.isNull(id),"id",id);
        
        List<User> users = userMapper.selectList(objectQueryWrapper);

        return users;
    }
}
