package homework31.Strategy;

public class Animal {
    private AnimalMovementStrategy movementStrategy;

    public Animal(AnimalMovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void setMovementStrategy(AnimalMovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public void move() {
        movementStrategy.move();
    }
}
