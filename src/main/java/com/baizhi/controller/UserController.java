package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller()
@RequestMapping("user")

public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("login")
    @ResponseBody
    public Map<String,Object> login(User user, HttpSession session){
        HashMap<String, Object> map = new HashMap<>();
        try{
            User login = userService.login(user);
            map.put("success",true);
            session.setAttribute("login",login);
            return map;
        }catch(Exception e){
            map.put("success",false);
            map.put("message",e.getMessage());
            return map;
        }
    }
}
