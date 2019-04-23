package com.baizhi.service;

import com.baizhi.entity.Emp;

import java.util.List;

public interface EmpService {
    List<Emp> queryAll(Integer page, Integer rows);
    Integer count();
    Emp selectById(String id);
}
