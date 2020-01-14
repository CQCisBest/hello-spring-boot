package com.cqc.hellospringboot.controller;

import com.cqc.hellospringboot.domain.Person;
import com.cqc.hellospringboot.service.PersonService;
import com.cqc.hellospringboot.service.impl.PersonServiceImpl;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class HelloController {
    @Resource
    private PersonServiceImpl personService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@RequestBody HashMap<String, String> map,String usr,String pwd) {
        usr = map.get("usr");
        System.out.println(usr);
        pwd = map.get("pwd");
        System.out.println(pwd);
        boolean flag = personService.login(usr, pwd);
        System.out.println(flag);
        if (flag) {
            return "{\"msg\":true}";
        } else {
            return "{\"msg\":false}";
        }

    }
}
