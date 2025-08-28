package com.neko.arc.services.impl;

import org.springframework.stereotype.Component;

import com.neko.arc.services.GreenPrinter;

@Component
public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "green";
    }
}
