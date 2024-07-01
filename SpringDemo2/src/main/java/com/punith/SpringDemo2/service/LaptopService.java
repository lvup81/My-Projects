package com.punith.SpringDemo2.service;

import com.punith.SpringDemo2.LaptopRepository;
import com.punith.SpringDemo2.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    LaptopRepository repo;
    public void addLaptop(Laptop lap){
        repo.save(lap);
    }
}
