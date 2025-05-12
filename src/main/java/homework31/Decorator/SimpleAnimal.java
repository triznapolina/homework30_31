package homework31.Decorator;

public class SimpleAnimal implements Animal {
    private String name;

    public SimpleAnimal(String name) {
        this.name = name;
    }

    @Override
    public String describe() {
        return "Animal: " + name;
    }
}
