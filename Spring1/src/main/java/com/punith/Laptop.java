package com.punith;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop object created");
    }
    @Override
    public void compile(){
        System.out.println("Compiling with Laptop");
    }
}
