package homework30.AbstractFactorry.classes;

import homework30.AbstractFactorry.interfaces.Animal;

public class Cat implements Animal {
    @Override
    public String makeSound() {
        return "Meow!";
    }
}
