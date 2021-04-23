package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Tang extends Fish {

    public Tang(String name, int weight, String color) {
        super(name, weight, color);
        hasMemoryloss=true;

    }

    @Override
    public void status() {

    }

    @Override
    public void feed() {
        weight=weight+1;
    }

}
