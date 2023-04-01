package ru.netology.graphics;

import ru.netology.graphics.image.BadImageSizeException;
import ru.netology.graphics.image.TextColorSchema;
import ru.netology.graphics.image.TextGraphicsConverter;

import java.io.IOException;

public class Converter implements TextGraphicsConverter {

    private String url;

    public Converter(String url) {
        this.url = url;
    }

    @Override
    public String convert(String url) throws IOException, BadImageSizeException {
        return "https://i.ibb.co/6DYM05G/edu0.jpg";
    }

    @Override
    public void setMaxWidth(int width) {

    }

    @Override
    public void setMaxHeight(int height) {

    }

    @Override
    public void setMaxRatio(double maxRatio) {

    }

    @Override
    public void setTextColorSchema(TextColorSchema schema) {

    }




}
