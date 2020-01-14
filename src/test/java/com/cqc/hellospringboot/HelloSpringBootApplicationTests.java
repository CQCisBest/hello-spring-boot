package com.cqc.hellospringboot;

import com.cqc.hellospringboot.domain.Person;
import com.cqc.hellospringboot.mapper.PersonMapper;
import lombok.val;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;


@SpringBootTest

@TestPropertySource("classpath:application.yml")
class HelloSpringBootApplicationTests {
    @Autowired
    PersonMapper personMapper;

    @Test
    public void testSelect() {
        List<Person> people = personMapper.selectAll();
        people.forEach(person -> System.out.println(person));
    }

    @Test
    public void findById() {
        Person person = personMapper.selectByPrimaryKey(20001);
        System.out.println(person);
        System.out.println(person.getPassword());
    }



    @Test
    public void tst(){
       String a = "1";
       Person person = personMapper.selectByPrimaryKey("20001");
       String b = person.getPassword();//获得密码
        System.out.println(b);//"1"
        System.out.println(a==b);//false



    }
}
