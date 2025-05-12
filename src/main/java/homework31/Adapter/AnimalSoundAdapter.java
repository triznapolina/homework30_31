package homework31.Adapter;

import homework31.Adapter.interfaces.NewAnimal;
import homework31.Adapter.interfaces.OldAnimalSound;

public class AnimalSoundAdapter implements NewAnimal {
    private OldAnimalSound oldAnimalSound;

    public AnimalSoundAdapter(OldAnimalSound oldAnimalSound) {
        this.oldAnimalSound = oldAnimalSound;
    }

    @Override
    public String animalSound() {
        oldAnimalSound.makeSound();
        return "done";
    }
}
