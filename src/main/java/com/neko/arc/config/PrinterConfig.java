package com.neko.arc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.neko.arc.services.BluePrinter;
import com.neko.arc.services.ColourPrinter;
import com.neko.arc.services.GreenPrinter;
import com.neko.arc.services.RedPrinter;
import com.neko.arc.services.impl.ColourPrinterImpl;
import com.neko.arc.services.impl.EnglishBluePrinter;
import com.neko.arc.services.impl.EnglishGreenPrinter;
import com.neko.arc.services.impl.EnglishRedPrinter;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new EnglishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new EnglishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
