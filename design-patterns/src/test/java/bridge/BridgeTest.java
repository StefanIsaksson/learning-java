package bridge;

import org.junit.Test;

public class BridgeTest {

    @Test
    public void test(){
        Rock rock = new Rock();
        rock.setName("Basalt");
        rock.setRockType(RockType.IGNEOUS);
        rock.setMohsScale(Integer.valueOf(6));
        rock.setVisualDescription("Dark-colored (usually black) and fine-grained");

        FileWriter jsonFileWriter = new JsonFileWriter();
        Persistor rockPersistor = new RockPersistor(rock);
        rockPersistor.save(jsonFileWriter);

        FileWriter xmlFileWriter = new XmlFileWriter();
        rockPersistor.save(xmlFileWriter);

        Tree tree = new Tree();
        tree.setName("Birch");
        tree.setHeight(31);
        tree.setDescription("white bark and triangular shaped leaves.");

        TreePersistor treePersistor = new TreePersistor(tree);
        treePersistor.save(jsonFileWriter);

    }
}
