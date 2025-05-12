package homework31.Chain;

public abstract class AnimalHandler {
    private AnimalHandler nextHandler;

    public void setNextHandler(AnimalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    protected AnimalHandler getNextHandler() {
        return nextHandler;
    }

    public abstract void handleRequest(String animalType);
}