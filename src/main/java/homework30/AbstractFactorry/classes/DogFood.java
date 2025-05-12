package homework30.AbstractFactorry.classes;

import homework30.AbstractFactorry.interfaces.Food;

public class DogFood implements Food {
    @Override
    public String getFoodType() {
        return "Dog Food";
    }
}

