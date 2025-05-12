package homework31.Decorator.decorators;

import homework31.Decorator.Animal;

public abstract class AnimalDecorator implements Animal {
    protected Animal animal;

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public String describe() {
        return animal.describe();
    }
}
