package zoo.mammals.primates;

public class monkey implements Primate {
    @Override
    public void move() {
        System.out.println("monkey move");
    }

    @Override
    public String getName() {
        return "Affe";
    }
}
