package hu.nive.ujratervezes.zarovizsga.aquarium;

public class Clownfish extends Fish {

    @Override
    public void status() {

    }

    @Override
    public void feed() {
        weight=weight+1;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Clownfish(String name, int weight, String color) {
        super(name, weight, color);
    }
}
