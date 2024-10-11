package flower.store;

import java.util.ArrayList;
import java.util.List;


public class FlowerBucket {
    private List<FlowerPack> FlowerPacks;

    public FlowerBucket() {
        this.FlowerPacks = new ArrayList<>();
    }

    public void addFlowerPack(FlowerPack flowerPack) {
        FlowerPacks.add(flowerPack);
    }

    public double getPrice() {
        return FlowerPacks.stream().map(x -> x.getPrice()).reduce(0.0, (a, b) -> a + b);
    }
}
