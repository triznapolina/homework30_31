package homework30.FactoryMethod;

import homework30.AbstractFactorry.classes.Dog;
import homework30.AbstractFactorry.interfaces.Animal;

public class DogFactoryMethod extends AnimalFactoryMethod {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
