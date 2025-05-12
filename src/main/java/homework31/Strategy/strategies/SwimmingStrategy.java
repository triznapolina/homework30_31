package homework31.Strategy.strategies;

import homework31.Strategy.AnimalMovementStrategy;

public class SwimmingStrategy implements AnimalMovementStrategy {
    @Override
    public void move() {
        System.out.println("The animal is swimming");
    }
}
