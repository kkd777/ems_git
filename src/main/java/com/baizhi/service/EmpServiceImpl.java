package com.baizhi.service;

import com.baizhi.dao.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("empService")
@Transactional
public class EmpServiceImpl implements EmpService {

    @Resource
    private EmpMapper empMapper;

    @Override
    public void delete(String id) {
        empMapper.deleteByPrimaryKey(id);
    }
}
