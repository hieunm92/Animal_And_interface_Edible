package animal;

import edible.Edible;

public class Tiger extends  Animal implements Edible {
    @Override
    public String makeSound() {
        return "Tiger: gru gru";
    }

    @Override
    public String howToEat() {
        return "can't be fried";
    }
}
