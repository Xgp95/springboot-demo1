package com.springboot.springbootdemo1.controller;

import com.springboot.springbootdemo1.bean.Person;
import com.springboot.springbootdemo1.bean.Pet;
import com.springboot.springbootdemo1.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Xugp
 * @date: 2022/5/17 16:46
 * @description:
 */
@RestController
//@Controller
public class ControllerTest {
    @Autowired
    User user01;
    @Autowired
    Pet tompet;
    @Autowired
    Person person01;

    @RequestMapping("/person01")
    public Person person01() {
//        System.out.println(person01);
        return person01;
    }

    @RequestMapping("/user01")
    public User user01() {
        user01.setPet(tompet);
        System.out.println(user01);
        return user01;
    }

    @GetMapping(value = "/girl.jpg")
    public String getGirl() {
        return "girl";
    }
}
