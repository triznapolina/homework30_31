package homework30.Prototype;

public abstract class AnimalPrototype implements Cloneable {
    private String name;

    public AnimalPrototype(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract AnimalPrototype clone();
}

