package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Flower> flowers;

    public Store() {
        flowers = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public List<Flower> search(Flower flower_match) {
        List<Flower> matchingFlowers = new ArrayList<>();
        for (Flower flower: flowers) {
            if (!flower.getColor().equals(flower_match.getColor())) {
                continue;
            }
            if (!flower.getFlowerType().equals(flower_match.getFlowerType())) {
                continue;
            }
            if (flower.getSepalLength() != flower_match.getSepalLength()) {
                continue;
            }
            matchingFlowers.add(flower);
        }
        return matchingFlowers;
    }
}
