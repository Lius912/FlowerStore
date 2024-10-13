package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class FlowerStoreTest {
    private static final double PRICE = 80;
    private static final double PRICE_TWO = 100;
    private static final double LENGTH = 8.0;
    private static final double LENGTH_TWO = 9.0;



    @Test
    public void testSearch() {
        Flower flower = new Flower(LENGTH,
        FlowerColor.GREEN, PRICE, FlowerType.CHAMOMILE);
        Flower flowerTwo = new Flower(LENGTH,
        FlowerColor.BLUE, PRICE, FlowerType.CHAMOMILE);
        Flower flowerThree = new Flower(LENGTH,
        FlowerColor.GREEN, PRICE_TWO, FlowerType.CHAMOMILE);
        Flower flowerFour = new Flower(LENGTH_TWO,
        FlowerColor.GREEN, PRICE, FlowerType.CHAMOMILE);
        Store store = new Store();
        store.addFlower(flower);
        store.addFlower(flowerTwo);
        store.addFlower(flowerThree);
        store.addFlower(flowerFour);
        List<Flower> expectedMatchedFlowers = new ArrayList<>();
        expectedMatchedFlowers.add(flower);
        expectedMatchedFlowers.add(flowerThree);
        List<Flower> matched = store.search(flower);
        Assertions.assertEquals(expectedMatchedFlowers.get(0), matched.get(0));
        Assertions.assertEquals(expectedMatchedFlowers.get(1), matched.get(1));
    }
}
