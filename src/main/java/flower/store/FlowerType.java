package flower.store;

public enum FlowerType {
    CHAMOMILE("chamomile"), ROSE("rose"), TULIP("tulip");
    private final String type;

    FlowerType(String type) {
        this.type = type;
    }

    public String toString() {
        return type;
    }
}
