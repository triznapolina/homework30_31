package homework31.Chain.handlers;

import homework31.Chain.AnimalHandler;

public class DefaultHandler extends AnimalHandler {
    @Override
    public void handleRequest(String animalType) {
        System.out.println("DefaultHandler: Unable to process request for animal type " + animalType);
    }
}
