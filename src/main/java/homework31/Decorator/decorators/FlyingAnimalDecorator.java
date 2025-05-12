package homework31.Decorator.decorators;

import homework31.Decorator.Animal;

public class FlyingAnimalDecorator extends AnimalDecorator {
    public FlyingAnimalDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public String describe() {
        return super.describe() + ", can fly";
    }
}
