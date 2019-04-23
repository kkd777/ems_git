package com.baizhi.service.impl;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl  implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public User login(User user) {
        User user1 = new User();
        user1.setUsername(user.getUsername());
        User login = userMapper.selectOne(user1);
        if(login == null){
            throw new RuntimeException("用户不存在");
        }else{
            if(user.getPassword().equals(login.getPassword())){
                return user1;
            }
                throw new RuntimeException("密码错误");

        }
    }
}
