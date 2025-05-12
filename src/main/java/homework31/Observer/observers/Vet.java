package homework31.Observer.observers;

import homework31.Observer.AnimalObserver;

public class Vet implements AnimalObserver {
    private String name;

    public Vet(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Veterinarian " + name + ": The animal performed an action - " + event);
    }
}
