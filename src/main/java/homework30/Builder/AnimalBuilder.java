package homework30.Builder;

import homework30.AbstractFactorry.interfaces.Animal;

public class AnimalBuilder {
    private String name;
    private String species;
    private int age;
    private String color;

    public AnimalBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AnimalBuilder setSpecies(String species) {
        this.species = species;
        return this;
    }

    public AnimalBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AnimalBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public Animal build() {
        return new ConcreteAnimal(name, species, age, color);
    }


    public static class ConcreteAnimal implements Animal {
        private String name;
        private String species;
        private int age;
        private String color;

        public ConcreteAnimal(String name, String species, int age, String color) {
            this.name = name;
            this.species = species;
            this.age = age;
            this.color = color;
        }

        @Override
        public String makeSound() {
            return "Animal sound";
        }

        public String getName() {
            return name;
        }

        public String getSpecies() {
            return species;
        }

        public int getAge() {
            return age;
        }

        public String getColor() {
            return color;
        }

    }
}

