package homework31.Chain.handlers;

import homework31.Chain.AnimalHandler;

public class DogHandler extends AnimalHandler {
    @Override
    public void handleRequest(String animalType) {
        if (animalType.equalsIgnoreCase("Dog")) {
            System.out.println("DogHandler: Handles the request for the dog");
        } else {
            if (getNextHandler() != null) {
                getNextHandler().handleRequest(animalType);
            }
        }
    }
}

