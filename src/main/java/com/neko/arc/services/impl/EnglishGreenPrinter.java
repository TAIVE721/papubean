package com.neko.arc.services.impl;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.neko.arc.services.GreenPrinter;

@Service
public class EnglishGreenPrinter implements GreenPrinter {

    @Override
    public String print() {
        return "green";
    }
}
