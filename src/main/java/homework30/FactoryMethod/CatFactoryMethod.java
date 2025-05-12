package homework30.FactoryMethod;

import homework30.AbstractFactorry.classes.Cat;
import homework30.AbstractFactorry.interfaces.Animal;

public class CatFactoryMethod extends AnimalFactoryMethod {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
