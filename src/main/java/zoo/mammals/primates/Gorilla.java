package zoo.mammals.primates;

public class Gorilla implements Primate {
    @Override
    public void move() {
        System.out.println("Gorilla move");
    }

    @Override
    public String getName() {
        return "Gorilla";
    }
}
