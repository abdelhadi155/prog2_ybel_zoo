package zoo;

public class Turtle implements Animal {
    @Override
    public void move() {
        System.out.println("turtle move");
    }

    @Override
    public String getName() {
        return "Schildkröte";
    }
}
