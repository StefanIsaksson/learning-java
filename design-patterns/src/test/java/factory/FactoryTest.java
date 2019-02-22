package factory;

import org.junit.Test;

public class FactoryTest {

    @Test
    public void test(){
        AnimalFactory factory = new AnimalFactory();
        Animal cow = factory.getInstance(AnimalType.COW);
        Animal sheep = factory.getInstance(AnimalType.SHEEP);
        Animal pig = factory.getInstance(AnimalType.PIG);
        cow.speak();
        sheep.speak();
        pig.speak();
    }
}
