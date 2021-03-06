package com.malik.chaoxinghelper.service.impl;

import com.malik.chaoxinghelper.dao.entity.User;
import com.malik.chaoxinghelper.dao.mapper.UserMapper;
import com.malik.chaoxinghelper.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author MalikCheng
 * @since 2020-02-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
