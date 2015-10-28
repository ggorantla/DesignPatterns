package CreationalDesignPatterns.FactoryPattern;

/**
 * Created by ggorantla on 10/28/2015.
 */
public class Dog implements Animal{
    @Override
    public void sound(){
        System.out.println("Dog always barks but its an awesome pet to have one");
    }
}
