package com.robert.service;

import com.robert.domain.Girl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)//在测试环境跑
@SpringBootTest//启动整个Spring的工程

public class GirlServiceTest {

    @Autowired
    GirlService girlService;

    @Test
    public void findOne() {
        Girl girl = girlService.findOne(14);
        Assert.assertEquals(new Integer(20), girl.getAge());
    }
}