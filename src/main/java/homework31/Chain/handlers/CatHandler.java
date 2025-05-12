package homework31.Chain.handlers;

import homework31.Chain.AnimalHandler;

public class CatHandler extends AnimalHandler {
    @Override
    public void handleRequest(String animalType) {
        if (animalType.equalsIgnoreCase("Cat")) {
            System.out.println("CatHandler: Handles the request for the cat ");
        } else {
            if (getNextHandler() != null) {
                getNextHandler().handleRequest(animalType);
            }
        }
    }
}
