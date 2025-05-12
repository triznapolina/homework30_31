package homework31.Decorator.decorators;

import homework31.Decorator.Animal;

public class StripedAnimalDecorator extends AnimalDecorator {
    public StripedAnimalDecorator(Animal animal) {
        super(animal);
    }
    @Override
    public String describe() {
        return super.describe() + ", with stripes";
    }
}
