package com.robert.service;

import com.robert.domain.Girl;
import com.robert.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class GirlService {

    private final GirlRepository girlRepository;

    @Autowired
    public GirlService(GirlRepository girlRepository) {
        this.girlRepository = girlRepository;
    }

    @Transactional
    public void insertTwo() {
        Girl a = new Girl();
        a.setName("Tom");
        a.setMoney(200);

    }

    /**
     * 寻找girl
     * @param id
     * @return
     */
    public Girl findOne(Integer id) {
        return girlRepository.findOne(id);
    }
}
