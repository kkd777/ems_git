package com.baizhi.service.impl;

import com.baizhi.dao.EmpMapper;
import com.baizhi.entity.Emp;
import com.baizhi.entity.User;
import com.baizhi.service.EmpService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public List<Emp> queryAll(Integer page, Integer rows) {

        PageHelper.startPage(page,rows);
        List<Emp> emps = empMapper.selectAll();
        return emps;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Integer count() {
        return empMapper.selectCount(new Emp());
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS)
    public Emp selectById(String id) {
        User user = new User();
        user.setId(id);
        Emp emp = empMapper.selectByPrimaryKey(user);
        return emp;
    }
}
