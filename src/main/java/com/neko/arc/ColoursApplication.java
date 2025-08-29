package com.neko.arc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import com.neko.arc.services.ColourPrinter;
import com.neko.arc.services.impl.ColourPrinterImpl;

@SpringBootApplication

public class ColoursApplication implements CommandLineRunner {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ColoursApplication.class, args);
		var papu = context.getBean(ColourPrinterImpl.class);

		System.out.println(papu.print());

	};

	@Override
	public void run(final String... args) {

	}

}
