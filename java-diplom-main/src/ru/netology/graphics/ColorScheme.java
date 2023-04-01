package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchema;

public class ColorScheme implements TextColorSchema {

    private int color;

    public ColorScheme(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @Override
    public char convert(int color) {
        if (color < 51) {
            return '#';
        } else if (color < 102) {
            return '$';
        } else if (color < 153) {
            return '@';
        } else if (color < 204) {
            return '%';
        } else if (color < 215) {
            return '*';
        } else if (color < 229) {
            return '+';
        } else if (color < 255) {
            return '-';
        } else {
            return '"';
        }
    }

    @Override
    public String toString() {
        return "ColorScheme{" +
                "color=" + color +
                '}';
    }
}
