package com.baomidou.mybatisplus.samples.quickstart.entity;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private Integer age;
    @TableField(exist = false)
    private String email;
    @TableField("city")
    private String cityy;
}
