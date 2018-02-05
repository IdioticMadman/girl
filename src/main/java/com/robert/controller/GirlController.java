package com.robert.controller;


import com.robert.domain.Girl;
import com.robert.domain.Result;
import com.robert.repository.GirlRepository;
import com.robert.service.GirlService;
import com.robert.util.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author robert
 */
@RestController
public class GirlController {

    private final GirlRepository girlRepository;
    private final GirlService girlService;

    @Autowired
    public GirlController(GirlRepository girlRepository, GirlService girlService) {
        this.girlRepository = girlRepository;
        this.girlService = girlService;
    }

    @GetMapping("/girl")
    public List<Girl> getAllGirl() {
        return girlRepository.findAll();
    }

    @PostMapping("/girl")
    public Result<Girl> saveGirl(@Valid @RequestBody Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getDefaultMessage());
            return ResultUtil.error(bindingResult.getFieldError().getDefaultMessage(), null);
        }
        return ResultUtil.ok(girlRepository.save(girl));
    }

    @PutMapping("/girl/{id}")
    public Girl updateGirl(@PathVariable("id") Integer id, @RequestBody Girl girl) {
        girl.setId(id);
        return girlRepository.save(girl);
    }

    @DeleteMapping("/girl/{id}")
    public void deleteGirl(@PathVariable("id") Integer id) {
        girlRepository.delete(id);
    }


    //通过年龄查询女生列表
    @GetMapping(value = "/girl/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age) {
        return girlRepository.findByAge(age);
    }

    @PostMapping(value = "/girl/two")
    public void girlTwo() {
        girlService.insertTwo();
    }

    @GetMapping(value = "/girl/getAge/{id}")
    public void getAge(@PathVariable("id") Integer id) {

    }

}
