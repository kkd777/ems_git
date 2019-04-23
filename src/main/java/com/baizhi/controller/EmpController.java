package com.baizhi.controller;

import com.baizhi.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("emp")
public class EmpController {
    @Autowired
    private EmpService empService;

    @RequestMapping("delete")
    @ResponseBody
    public String delete(String id){
        empService.delete(id);
        return "forward:/emp/queryAll";
    }



}
