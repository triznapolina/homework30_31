package homework30.Prototype;

public class DogPrototype extends AnimalPrototype {
    public DogPrototype(String name) {
        super(name);
    }

    @Override
    public DogPrototype clone() {
        return new DogPrototype(this.getName());
    }
}

