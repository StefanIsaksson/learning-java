package adapter;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AdapterTest {

    ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void test() throws IOException {
        List<Flygplan> flygplanList = getFlygplan();
        List<Airplane> airplanes = getFighterJets();
        for (Flygplan flygplan : flygplanList){
            airplanes.add(new FlygplanAirplaneAdapter(flygplan));
        }
        for(Airplane airplane : airplanes){
            System.out.println("Name : " + airplane.getName() + ", price: " + airplane.getPrice());
        }
    }

    private List<Flygplan> getFlygplan() throws IOException {
        File jsonFile = new File("target/classes/flygplan.json");
        return objectMapper.readValue(jsonFile, new TypeReference<List<Flygplan>>(){});
    }

    private List<Airplane> getFighterJets() throws IOException {
        File jsonFile = new File("target/classes/fighter_jets.json");
        return objectMapper.readValue(jsonFile, new TypeReference<List<FighterJet>>(){});
    }
}
