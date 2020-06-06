package com.example.demo.respositotry;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class userRespositotyTest {

    @Autowired
    private userRespositoty userRespositoty;

    @Test
    void finall(){
        System.out.println(userRespositoty.findAll());
    }

}