package zoo;

import zoo.fishes.*;

public class Main {
    public static void main(String[] args) {

        Habitat<Fish> troutHabitat = new Habitat<>("Forellenbecken");
        troutHabitat.add(new Trout());


        Habitat<Fish> salmonHabitat = new Habitat<>("Lachsbecken");
        salmonHabitat.add(new Salmon());


        Aquarium aquarium = new Aquarium();
        aquarium.build(troutHabitat);
        aquarium.build(salmonHabitat);


        aquarium.visitAllHabitats();
    }
}
