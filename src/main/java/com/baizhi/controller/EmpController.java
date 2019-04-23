package com.baizhi.controller;

import com.baizhi.entity.Emp;
import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;
    @RequestMapping("findOne")
    public String findOne(String id, HttpServletRequest request){
        Emp emp = empService.findOne(id);
        request.getSession().setAttribute("emp",emp);
        return "updateEmp";
    }
    @RequestMapping("update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/queryAll";
    }
}
