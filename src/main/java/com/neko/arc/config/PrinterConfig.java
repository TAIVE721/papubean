package com.neko.arc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.neko.arc.services.BluePrinter;
import com.neko.arc.services.ColourPrinter;
import com.neko.arc.services.GreenPrinter;
import com.neko.arc.services.RedPrinter;
import com.neko.arc.services.impl.ColourPrinterImpl;
import com.neko.arc.services.impl.SpanishBluePrinter;
import com.neko.arc.services.impl.SpanishGreenPrinter;
import com.neko.arc.services.impl.SpanishRedPrinter;

@Configuration
public class PrinterConfig {

    @Bean
    public BluePrinter bluePrinter() {
        return new SpanishBluePrinter();
    }

    @Bean
    public RedPrinter redPrinter() {
        return new SpanishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter() {
        return new SpanishGreenPrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter) {
        return new ColourPrinterImpl(redPrinter, bluePrinter, greenPrinter);
    }
}
