package zoo.mammals;

public class Mouse implements Mammal {
    @Override
    public void move() {
        System.out.println("Mouse move");
    }

    @Override
    public String getName() {
        return "Maus";
    }
}
