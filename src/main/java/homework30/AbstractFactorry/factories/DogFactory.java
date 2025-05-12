package homework30.AbstractFactorry.factories;

import homework30.AbstractFactorry.classes.Dog;
import homework30.AbstractFactorry.classes.DogFood;
import homework30.AbstractFactorry.interfaces.Animal;
import homework30.AbstractFactorry.interfaces.AnimalFactory;
import homework30.AbstractFactorry.interfaces.Food;

public class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public Food createFood() {
        return new DogFood();
    }
}
