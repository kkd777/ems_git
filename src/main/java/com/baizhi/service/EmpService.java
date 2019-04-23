package com.baizhi.service;

import com.baizhi.entity.Emp;

public interface EmpService {

    Emp findOne(String id);

    void update(Emp emp);
}
