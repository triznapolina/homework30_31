package homework30.AbstractFactorry.factories;

import homework30.AbstractFactorry.classes.Cat;
import homework30.AbstractFactorry.classes.CatFood;
import homework30.AbstractFactorry.interfaces.Animal;
import homework30.AbstractFactorry.interfaces.AnimalFactory;
import homework30.AbstractFactorry.interfaces.Food;

public class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public Food createFood() {
        return new CatFood();
    }
}
