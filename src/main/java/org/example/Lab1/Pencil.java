package org.example.Lab1;

public class Pencil extends Hexagon{
    private final boolean isStrong;
    private int volume;

    public Pencil(int hexagonArea, int sideLength, boolean isStrong) {
        super(sideLength, hexagonArea);
        this.isStrong = isStrong;
    }

    public int getVolume(){
        volume = getHexagonArea() * getSideLength();
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setSide(int side) {
        setSideLength(side);
    }

    public void grindingSpeed(){
        int count = 0;
        if (isStrong){
            while(volume > 1) {
                setSide(getSideLength() - 2);
                setVolume(getVolume());
                count++;
            }
        }
        else {
            while(volume > 1) {
                setSide(getSideLength() - 3);
                setVolume(getVolume());
                count++;
            }
        }
        System.out.println("Карандаш спишется за "  + count + " дней");
    }
}



