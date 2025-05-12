package homework31.Strategy;

public class Animall {
    private AnimalMovementStrategy movementStrategy;

    public Animall(AnimalMovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void setMovementStrategy(AnimalMovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void move() {
        movementStrategy.move();
    }
}
