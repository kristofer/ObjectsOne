package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        //Person
        Person person1 = new Person("Jane", 23, 189);
        System.out.println("Name: "+ person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Height: " + person1.height);
        System.out.println();

        //Car
        Car car = new Car("Honda","CR-V", 2022,29 );
        System.out.println(car);
        System.out.println();

        //Chair
        Chair chair = new Chair("Wood", "brown", 4);
        System.out.println(chair);
        System.out.println();
        //Dog
        Dog dog = new Dog("Jacky", 3, "German Shepherd" );
        System.out.println(dog);




    }


}
