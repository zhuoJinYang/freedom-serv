package com.freedom.springcloudapi.service.impl;

import com.freedom.springcloudapi.entity.User;
import com.freedom.springcloudapi.mapper.UserMapper;
import com.freedom.springcloudapi.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zjy
 * @since 2022-11-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
