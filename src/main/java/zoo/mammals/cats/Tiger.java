package zoo.mammals.cats;

import zoo.mammals.Mammal;

public class Tiger implements Mammal {
    @Override
    public void move() {
        System.out.println("Der Tiger bewegt sich schnell auf allen Vieren");
    }

    @Override
    public String getName() {
        return "Tiger";
    }
}
