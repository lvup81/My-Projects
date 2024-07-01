package com.punith.SpringDemo2;

import com.punith.SpringDemo2.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap){
        System.out.println("Data Saved and all CRUD operations are goint here");
    }

}
