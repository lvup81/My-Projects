package com.punith;

import com.punith.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App
{
    public static  void main(String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien a = context.getBean(Alien.class);
        a.setAge(21);
        System.out.println(a.getAge());
        a.code();
//        Desktop dt= context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1= context.getBean(Desktop.class);
//        dt1.compile();






//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien a = (Alien) context.getBean("alien");
//        a.age=20;
//        System.out.println(a.age);
//        a.code();

//        Alien b = (Alien) context.getBean("alien");
//
//        System.out.println(b.age);
//        b.code();
    }
}
