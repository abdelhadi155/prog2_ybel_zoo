package zoo;

public class Lizard implements Animal {
    @Override
    public void move() {
        System.out.println("Lizard move");
    }

    @Override
    public String getName() {
        return "Eidechse";
    }
}
