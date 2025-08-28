package com.neko.arc.services.impl;

import org.springframework.stereotype.Component;

import com.neko.arc.services.BluePrinter;

@Component
public class EnglishBluePrinter implements BluePrinter {

    @Override
    public String print() {
        return "blue";
    }
}
