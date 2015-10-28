package CreationalDesignPatterns.FactoryPattern;

/**
 * Created by ggorantla on 10/28/2015.
 */
public class AnimalFactory {

    public Animal getAnimalSound(String animalSound){
        if (animalSound == null)
            return null;

        if (animalSound.equalsIgnoreCase("DOG"))
            return new Dog();
        else if (animalSound.equalsIgnoreCase("CAT"))
            return new Cat();
        else if (animalSound.equalsIgnoreCase("Elephant"))
            return new Elephant();

        return null;
    }
}
