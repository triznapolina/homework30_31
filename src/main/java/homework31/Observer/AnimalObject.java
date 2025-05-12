package homework31.Observer;

import java.util.ArrayList;
import java.util.List;

public class AnimalObject implements AnimalObservable {
    private String name;
    private String event;
    private List<AnimalObserver> observers = new ArrayList<>();

    public AnimalObject(String name) {
        this.name = name;
    }

    public void setEvent(String event) {
        this.event = event;
        notifyObservers(event);
    }

    @Override
    public void addObserver(AnimalObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(AnimalObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String event) {
        for (AnimalObserver observer : observers) {
            observer.update(event);
        }
    }

    public String getName() {
        return name;
    }
}
