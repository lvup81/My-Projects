package com.punith.SpringDemo2;

import com.punith.SpringDemo2.model.Laptop;
import com.punith.SpringDemo2.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemo2Application {

	public static void main(String[] args) {

		ApplicationContext context=SpringApplication.run(SpringDemo2Application.class, args);

		LaptopService service = context.getBean(LaptopService.class);
		Laptop laptop = context.getBean(Laptop.class);
		service.addLaptop(laptop);
	}

}
