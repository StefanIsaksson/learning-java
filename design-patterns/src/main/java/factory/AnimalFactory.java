package factory;

public class AnimalFactory {

    public Animal getInstance(AnimalType animalType) {
        switch (animalType) {
            case COW:
                return new Cow();
            case PIG:
                return new Pig();
            case SHEEP:
                return new Sheep();
                default:
                    throw new IllegalArgumentException("");
        }
    }
}
