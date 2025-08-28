package com.neko.arc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import com.neko.arc.services.ColourPrinter;

@SpringBootApplication

public class ColoursApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public ColoursApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {

		SpringApplication.run(ColoursApplication.class, args);

	};

	@Override
	public void run(final String... args) {
		System.out.println(colourPrinter.print());
	}

}
