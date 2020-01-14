package com.cqc.hellospringboot.service.impl;


import javax.annotation.Resource;

import com.cqc.hellospringboot.domain.Person;
import com.cqc.hellospringboot.mapper.PersonMapper;
import com.cqc.hellospringboot.service.PersonService;
import lombok.val;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService{

    @Resource
    private PersonMapper personMapper;
    public boolean login(String usr,String pwd){
        boolean flag = false;
        Person person = personMapper.selectByPrimaryKey(usr);
        System.out.println(person);
        if(person!=null){
               if(person.getPassword().equals(pwd)){
                   flag=true;
               }else {
                   return  flag;
               }
        }
        return flag;
    }

}
