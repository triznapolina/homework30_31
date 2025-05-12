package homework31;

import homework31.Adapter.AnimalSoundAdapter;
import homework31.Adapter.classes.LionSound;
import homework31.Chain.AnimalHandler;
import homework31.Chain.handlers.CatHandler;
import homework31.Chain.handlers.DefaultHandler;
import homework31.Chain.handlers.DogHandler;
import homework31.Decorator.Animal;
import homework31.Decorator.SimpleAnimal;
import homework31.Decorator.decorators.FlyingAnimalDecorator;
import homework31.Decorator.decorators.StripedAnimalDecorator;
import homework31.Facade.AnimalShelterFacade;
import homework31.Observer.AnimalObject;
import homework31.Observer.observers.Vet;
import homework31.Observer.observers.ZooKeeper;
import homework31.Strategy.Animall;
import homework31.Strategy.strategies.SwimmingStrategy;
import homework31.Strategy.strategies.WalkingStrategy;

public class AnimalMainStart31 {

    public static void main(String[] args) {
        // Adapter
        LionSound lionSound = new LionSound();
        AnimalSoundAdapter adapter = new AnimalSoundAdapter(lionSound);
        System.out.println(adapter.animalSound());

        // Facade
        AnimalShelterFacade shelter = new AnimalShelterFacade();
        shelter.careForAnimal("meat");

        // Decorator
        Animal animal = new SimpleAnimal("tiger");
        Animal stripedAnimal = new StripedAnimalDecorator(animal);
        Animal flyingStripedAnimal = new FlyingAnimalDecorator(stripedAnimal);
        System.out.println(flyingStripedAnimal.describe());

        // Strategy
        Animall animal1 = new Animall(new WalkingStrategy());
        animal1.move();
        animal1.setMovementStrategy(new SwimmingStrategy());
        animal1.move();

        // Observer
        AnimalObject lion = new AnimalObject("lion");
        ZooKeeper zooKeeper = new ZooKeeper("Vasya");
        Vet vet = new Vet("Sveta");
        lion.addObserver(zooKeeper);
        lion.addObserver(vet);
        lion.setEvent("The lion has escaped from the cage");
        lion.removeObserver(vet);
        lion.setEvent("The lion returned to the cage");

        // Chain
        AnimalHandler dogHandler = new DogHandler();
        AnimalHandler catHandler = new CatHandler();
        AnimalHandler defaultHandler = new DefaultHandler();

        dogHandler.setNextHandler(catHandler);
        catHandler.setNextHandler(defaultHandler);

        dogHandler.handleRequest("Dog");
        dogHandler.handleRequest("Cat");
        dogHandler.handleRequest("Tiger");


    }

}
