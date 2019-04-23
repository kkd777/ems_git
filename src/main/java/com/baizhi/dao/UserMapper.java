package com.baizhi.dao;

import com.baizhi.entity.User;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(String id);
//在他娘的不成功就衫裤了
    int insert(User record);

    User selectByPrimaryKey(String id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
}