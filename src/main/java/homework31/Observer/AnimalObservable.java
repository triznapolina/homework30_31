package homework31.Observer;

public interface AnimalObservable {
    void addObserver(AnimalObserver observer);
    void removeObserver(AnimalObserver observer);
    void notifyObservers(String event);
}
