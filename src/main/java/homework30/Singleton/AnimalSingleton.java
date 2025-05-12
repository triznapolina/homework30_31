package homework30.Singleton;

public class AnimalSingleton {
    private static AnimalSingleton instance;
    private String name;

    private AnimalSingleton(String name) {
        this.name = name;
    }

    public static AnimalSingleton getInstance(String name) {
        if (instance == null) {
            instance = new AnimalSingleton(name);
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
