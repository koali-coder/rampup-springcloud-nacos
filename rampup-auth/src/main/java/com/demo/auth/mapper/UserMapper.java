package com.demo.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.auth.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<User> {
}
