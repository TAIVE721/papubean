package com.neko.arc.services.impl;

import org.springframework.stereotype.Component;

import com.neko.arc.services.BluePrinter;
import com.neko.arc.services.ColourPrinter;
import com.neko.arc.services.GreenPrinter;
import com.neko.arc.services.RedPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter) {
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }

    @Override
    public String print() {
        return String.join("", "", redPrinter.print(), bluePrinter.print(), greenPrinter.print());
    }
}
