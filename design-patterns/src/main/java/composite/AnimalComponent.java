package composite;

import java.util.ArrayList;
import java.util.List;

public abstract class AnimalComponent {

    String name;
    String taxonomicRank;
    String comment;
    List<AnimalComponent> animalComponents = new ArrayList<>();

    public AnimalComponent add(AnimalComponent animalComponent) {
        throw new UnsupportedOperationException();
    }

    public AnimalComponent remove(AnimalComponent animalComponent) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public String getTaxonomicRank() {
        return taxonomicRank;
    }

    public String getComment(){
        return comment;
    }

    public abstract String toString(int indent);

    String print(AnimalComponent animalComponent) {
        StringBuilder builder = new StringBuilder(animalComponent.getName());
        if(getComment() != null){
            builder.append(" (");
            builder.append(getComment());
            builder.append(")");
        } else {
            builder.append(" [");
            builder.append(getTaxonomicRank().toCharArray());
            builder.append("]");
        }
        builder.append("\n");
        return builder.toString();
    }

    static String getIndention(int length) {
        if(length==0){
            return "";
        }
        return String.format("%1$"+length+ "s", " ");
    }

}
