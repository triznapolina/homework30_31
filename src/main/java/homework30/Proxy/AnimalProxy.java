package homework30.Proxy;

public class AnimalProxy implements AnimalAction {
    private String name;
    private RealAnimal realAnimal;

    public AnimalProxy(String name) {
        this.name = name;
    }

    @Override
    public void feed() {
        if (realAnimal == null) {
            realAnimal = new RealAnimal(name);
        }
        realAnimal.feed();
    }
}
