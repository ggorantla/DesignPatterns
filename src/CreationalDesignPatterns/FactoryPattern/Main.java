package CreationalDesignPatterns.FactoryPattern;

/**
 * Created by ggorantla on 10/28/2015.
 */
public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactoryobj = new AnimalFactory();

        // Lets get a dog classed object
        Animal dogobj = animalFactoryobj.getAnimalSound("DOG");
        dogobj.sound();
        // Now lets try Cat
        Animal catobj = animalFactoryobj.getAnimalSound("CAT");
        catobj.sound();
        // And then elephant

        Animal eleobj = animalFactoryobj.getAnimalSound("Elephant");
        eleobj.sound();
        /*
            Expected output :
            Dog always barks but its an awesome pet to have one
            Cats meow and also they purr!!!
            Mostly elephants trumpet. They are huge but kind
         */
    }
}
