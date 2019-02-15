package bridge;

import java.util.ArrayList;
import java.util.List;

public class RockPersistor extends Persistor {

    private Rock rock;

    public RockPersistor(Rock rock) {
        this.rock = rock;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();

        details.add(getRockTypeDetail(rock.getRockType()));
        details.add(new Detail("Description", rock.getVisualDescription()));
        details.add(getHardDetail(rock.getMohsScale()));
        return details;
    }

    private Detail getHardDetail(Integer mohsScale) {
        if(mohsScale > 5){
            return new Detail("Hard", "Yes");
        } else {
            return new Detail("Hard", "No");
        }
    }

    private Detail getRockTypeDetail(RockType rocktype) {
        switch (rocktype) {
            case IGNEOUS:
                return new Detail("Type", "Igneous rock");
            case METAMORPHIC:
                return new Detail("Type", "Metamorphic rock");
            case SEDIMENTARY:
                return new Detail("Type", "Sedimentary rock");
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override
    protected String getHeader() {
        return rock.getName();
    }
}
