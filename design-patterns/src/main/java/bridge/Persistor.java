package bridge;

import java.util.List;

public abstract class Persistor {

    public void save(FileWriter fileWriter) {
        fileWriter.save(getHeader(), getDetails());
    }

    abstract protected List<Detail> getDetails();

    abstract protected String getHeader();

}
