package com.baizhi.service;

import com.baizhi.dao.EmpMapper;
import com.baizhi.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class EmpServiceImpl implements EmpService {
    @Resource
    private EmpMapper empMapper;
    @Transactional(propagation = Propagation.SUPPORTS)
    @Override
    public Emp findOne(String id) {
        Emp emp = empMapper.selectByPrimaryKey(id);
        return emp;
    }

    @Override
    public void update(Emp emp) {
        empMapper.updateByPrimaryKey(emp);
    }
}
