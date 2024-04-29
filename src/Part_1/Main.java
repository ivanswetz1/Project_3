package Part_1;

import Soundmakers.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1.1.4
        //1.1.5
        //1.1.6
        Vehicle Honda = new Car();
        Honda.theMethod();
        // Output: Car
        // Since a subclass inherits from its superclass, an object of the subclass type can be assigned to a variable of the superclass type.
        //This is because the subclass object possesses all the characteristics of the superclass,
        //so it can be treated as if it were an instance of the superclass.


        //1.2.4
        ArrayList<Animal> Animals = new ArrayList<Animal>();
        Animals.add(new Dog());
        Animals.add(new Cat());
        Animals.add(new Cow());
        Animals.add(new Pig());

        //1.2.5

        for (Animal animal : Animals) {
            animal.makeSound();
        }

        //1.3.9

        ArrayList<SoundMaker> SoundMakers = new ArrayList<SoundMaker>();
        SoundMakers.add(new Bee());
        SoundMakers.add(new Cricket());
        SoundMakers.add(new Frog());

        for (SoundMaker soundMaker : SoundMakers) {
            soundMaker.makeSound();
        }
    }
}