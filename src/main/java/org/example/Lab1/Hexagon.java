package org.example.Lab1;

class Hexagon extends Side{
    private final int area;

    public Hexagon(int length, int area) {
        super(length);
        this.area = area;
    }

    public int getHexagonArea() {
        return area;
    }



}
