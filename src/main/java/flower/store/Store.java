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

    public List<Flower> search(Flower flowerMatch) {
        List<Flower> matchingFlowers = new ArrayList<>();
        for (Flower flower: flowers) {
            if (!flower.getColor().equals(flowerMatch.getColor())) {
                continue;
            }
            if (!flower.getFlowerType().equals(flowerMatch.getFlowerType())) {
                continue;
            }
            if (flower.getSepalLength() != flowerMatch.getSepalLength()) {
                continue;
            }
            matchingFlowers.add(flower);
        }
        return matchingFlowers;
    }
}
