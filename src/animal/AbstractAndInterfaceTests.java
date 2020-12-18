package animal;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals){
            animal.makeSound();
            System.out.println(animal.makeSound());
        }

    }
}
