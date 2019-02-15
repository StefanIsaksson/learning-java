package bridge;

import java.util.ArrayList;
import java.util.List;

public class TreePersistor extends Persistor {

    private Tree tree;

    public TreePersistor(Tree tree) {
        this.tree = tree;
    }

    @Override
    protected List<Detail> getDetails() {
        List<Detail> details = new ArrayList<>();
        details.add(new Detail("Description", tree.getDescription()));
        details.add(new Detail("Height", String.valueOf(tree.getHeight())));
        return details;
    }


    @Override
    protected String getHeader() {
        return tree.getName();
    }
}
