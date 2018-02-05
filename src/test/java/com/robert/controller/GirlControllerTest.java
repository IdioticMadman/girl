package com.robert.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GirlControllerTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getAllGirl() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/girl"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void saveGirl() {
    }

    @Test
    public void updateGirl() {
    }

    @Test
    public void deleteGirl() {
    }

    @Test
    public void girlListByAge() {
    }

    @Test
    public void girlTwo() {
    }

    @Test
    public void getAge() {
    }
}