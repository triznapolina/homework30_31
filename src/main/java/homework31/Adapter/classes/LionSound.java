package homework31.Adapter.classes;

import homework31.Adapter.interfaces.OldAnimalSound;

public class LionSound implements OldAnimalSound {
    @Override
    public void makeSound() {
        System.out.println("RRRR-rrrr");
    }
}
