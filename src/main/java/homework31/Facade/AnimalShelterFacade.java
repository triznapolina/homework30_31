package homework31.Facade;

import homework31.Facade.classes.AnimalCare;
import homework31.Facade.classes.AnimalFeeding;
import homework31.Facade.classes.AnimalHealth;

public class AnimalShelterFacade {
    private AnimalCare care;
    private AnimalFeeding feeding;
    private AnimalHealth health;

    public AnimalShelterFacade() {
        this.care = new AnimalCare();
        this.feeding = new AnimalFeeding();
        this.health = new AnimalHealth();
    }

    public void careForAnimal(String food) {
        care.cleanCage();
        feeding.giveFood(food);
        health.checkHealth();
    }
}
