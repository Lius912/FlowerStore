package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class FlowerStoreTest {
    @Test
    public void testSearch() {
        Flower flower = new Flower(8.0, FlowerColor.GREEN, 80, FlowerType.CHAMOMILE);
        Flower flower2 = new Flower(8.0, FlowerColor.BLUE, 80, FlowerType.CHAMOMILE);
        Flower flower3 = new Flower(8.0, FlowerColor.GREEN, 100, FlowerType.CHAMOMILE);
        Flower flower4 = new Flower(9.0, FlowerColor.GREEN, 80, FlowerType.CHAMOMILE);
        Store store = new Store();
        store.addFlower(flower);
        store.addFlower(flower2);
        store.addFlower(flower3);
        store.addFlower(flower4);
        List<Flower> expectedMatchedFlowers = new ArrayList<>();
        expectedMatchedFlowers.add(flower);
        expectedMatchedFlowers.add(flower3);
        List<Flower> matched = store.search(flower);
        Assertions.assertEquals(expectedMatchedFlowers.get(0), matched.get(0));
        Assertions.assertEquals(expectedMatchedFlowers.get(1), matched.get(1));
    }
}
