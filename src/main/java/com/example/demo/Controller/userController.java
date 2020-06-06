package com.example.demo.Controller;

import com.example.demo.entity.user;
import com.example.demo.respositotry.userRespositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class userController {
    @Autowired
    private userRespositoty userRespositoty;

    @RequestMapping("findAll")
    public List<user> findAll(){
        return userRespositoty.findAll();
    }

}
