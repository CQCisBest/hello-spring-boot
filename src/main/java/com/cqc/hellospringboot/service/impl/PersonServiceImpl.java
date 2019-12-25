package com.cqc.hellospringboot.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.cqc.hellospringboot.mapper.PersonMapper;
import com.cqc.hellospringboot.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService{

    @Resource
    private PersonMapper personMapper;

}
