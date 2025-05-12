package homework30.AbstractFactorry.classes;

import homework30.AbstractFactorry.interfaces.Food;

public class CatFood implements Food {
    @Override
    public String getFoodType() {
        return "Cat Food";
    }
}

