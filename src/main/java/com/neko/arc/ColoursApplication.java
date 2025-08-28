package com.neko.arc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.neko.arc.services.ColourPrinter;

@SpringBootApplication

public class ColoursApplication {

	private ColourPrinter colourPrinter;

	public ColoursApplication(ColourPrinter colourPrinter) {
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {

		SpringApplication.run(ColoursApplication.class, args);
	};

	public void run(final String... args) {

		colourPrinter.print();
	}

}
