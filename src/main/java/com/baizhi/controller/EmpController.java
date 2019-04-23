package com.baizhi.controller;


import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("emp")

public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("queryAll")
    public String queryAll(Integer page, HttpServletRequest request){
        page=page==null?1:page;
        List<Emp> emps = empService.queryAll(page, 3);
        Integer count = empService.count();
        request.setAttribute("emps",emps);
        request.setAttribute("count",count);
        return "emplist";
    }

    @RequestMapping("queryOne")
    public String  queryOne(String id,HttpServletRequest request){
        Emp emp = empService.selectById(id);
        request.setAttribute("emp",emp);
        return "updateEmp";
    }


}
