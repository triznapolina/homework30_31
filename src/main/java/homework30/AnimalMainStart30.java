package homework30;

import homework30.AbstractFactorry.factories.CatFactory;
import homework30.AbstractFactorry.factories.DogFactory;
import homework30.AbstractFactorry.interfaces.Animal;
import homework30.AbstractFactorry.interfaces.AnimalFactory;
import homework30.AbstractFactorry.interfaces.Food;
import homework30.Builder.AnimalBuilder;
import homework30.FactoryMethod.AnimalFactoryMethod;
import homework30.FactoryMethod.CatFactoryMethod;
import homework30.FactoryMethod.DogFactoryMethod;
import homework30.Prototype.DogPrototype;
import homework30.Proxy.AnimalProxy;
import homework30.Singleton.AnimalSingleton;

public class AnimalMainStart {

    public static void main(String[] args) {

        // Singleton
        AnimalSingleton singleton1 = AnimalSingleton.getInstance("Max");
        System.out.println("Singleton object: " + singleton1.getName());
        AnimalSingleton singleton2 = AnimalSingleton.getInstance("Buddy");
        System.out.println("Singleton object: " + singleton2.getName());

        // Abstract Factory
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        Food dogFood = dogFactory.createFood();
        System.out.println("Abstract Factory: Dog sound - " + dog.makeSound() + ", Food - " + dogFood.getFoodType());

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        Food catFood = catFactory.createFood();
        System.out.println("Abstract Factory: Cat sound - " + cat.makeSound() + ", Food - " + catFood.getFoodType());

        // Factory Method
        AnimalFactoryMethod dogFactoryMethod = new DogFactoryMethod();
        Animal dog2 = dogFactoryMethod.createAnimal();
        System.out.println("Factory Method: Dog sound - " + dog2.makeSound());

        AnimalFactoryMethod catFactoryMethod = new CatFactoryMethod();
        Animal cat2 = catFactoryMethod.createAnimal();
        System.out.println("Factory Method: Cat sound - " + cat2.makeSound());

        // Builder
        AnimalBuilder builder = new AnimalBuilder();
        Animal animal = builder.setName("Rex").setSpecies("Dog").setAge(2).setColor("Brown").build();
        System.out.println("Builder: Name - " + ((AnimalBuilder.ConcreteAnimal)animal).getName() + ", " +
                "Species - " + ((AnimalBuilder.ConcreteAnimal)animal).getSpecies());

        // Prototype
        DogPrototype originalDog = new DogPrototype("Bob");
        DogPrototype clonedDog = originalDog.clone();
        clonedDog.setName("Richy");
        System.out.println("Prototype: Original dog - " + originalDog.getName() +
                ", Cloned dog - " + clonedDog.getName());

        // Proxy
        AnimalProxy proxyAnimal = new AnimalProxy("Luna");
        proxyAnimal.feed();
    }
}
