package facade;

import org.junit.Test;

public class FacadeTest {

    @Test
    public void test(){
        MongoFacade mongoFacade = new MongoFacade();
        mongoFacade.insertFlower(new Flower("Amaryllis", "popular bulb plant with large blooms and long stems."));
        mongoFacade.insertFlower(new Flower("Daffodil", "trumpet-shaped blooms and are often yellow or white in color."));

        for (Flower flower : mongoFacade.getFlowers()){
            System.out.println(flower);
        }
    }
}
