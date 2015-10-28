package CreationalDesignPatterns.FactoryPattern;

/**
 * Created by ggorantla on 10/28/2015.
 */
public class Cat implements Animal {
    @Override
    public void sound(){
        System.out.println("Cats meow and also they purr!!!");
    }

}
