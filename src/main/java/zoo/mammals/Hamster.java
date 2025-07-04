package zoo.mammals;

public class Hamster implements Mammal {
    @Override
    public void move() {
        System.out.println("Hamster move");
    }

    @Override
    public String getName() {
        return "Hamster";
    }
}
