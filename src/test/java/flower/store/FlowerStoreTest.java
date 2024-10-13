package flower.store;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.List;

public class FlowerStoreTest {
    private double price = 80;
    private double priceTwo = 100;
    private double length = 8.0;
    private double lengthTwo = 9.0;



    @Test
    public void testSearch() {
        Flower flower = new Flower(length
        , FlowerColor.GREEN, price, FlowerType.CHAMOMILE);
        Flower flowerTwo = new Flower(length
        , FlowerColor.BLUE, price, FlowerType.CHAMOMILE);
        Flower flowerThree = new Flower(length
        , FlowerColor.GREEN, priceTwo, FlowerType.CHAMOMILE);
        Flower flowerFour = new Flower(lengthTwo
        , FlowerColor.GREEN, price, FlowerType.CHAMOMILE);
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
