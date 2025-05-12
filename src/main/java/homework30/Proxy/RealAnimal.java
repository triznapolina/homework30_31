package homework30.Proxy;

public class RealAnimal implements AnimalAction {
    private String name;

    public RealAnimal(String name) {
        this.name = name;
        loadAnimalData();
    }

    private void loadAnimalData() {
        System.out.println("Loading data for animal: " + name);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Data loaded for animal: " + name);
    }

    @Override
    public void feed() {
        System.out.println("Feeding " + name);
    }
}
