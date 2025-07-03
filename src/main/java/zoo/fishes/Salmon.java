package zoo.fishes;

public class Salmon implements Fish {
    @Override
    public void move() {
        System.out.println("Der Lachs benutzt seine Schwanzflosse zum schwimmen");
    }

    @Override
    public String getName() {
        return "Lachs";
    }
}
