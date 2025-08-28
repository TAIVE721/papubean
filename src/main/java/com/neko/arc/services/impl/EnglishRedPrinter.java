package com.neko.arc.services.impl;

import org.springframework.stereotype.Component;

import com.neko.arc.services.RedPrinter;

@Component
public class EnglishRedPrinter implements RedPrinter {

    @Override
    public String print() {
        return "red";
    }
}
