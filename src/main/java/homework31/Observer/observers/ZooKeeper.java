package homework31.Observer.observers;

import homework31.Observer.AnimalObserver;

public class ZooKeeper implements AnimalObserver {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    @Override
    public void update(String event) {
        System.out.println("Caretaker " + name + ": The animal performed an action - " + event);
    }
}
