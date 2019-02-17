package composite;

public class AnimalGroup extends AnimalComponent {

    public AnimalGroup(String name, String taxonomicRank){
        this.name = name;
        this.taxonomicRank = taxonomicRank;
    }

    @Override
    public AnimalComponent add(AnimalComponent animalComponent){
        animalComponents.add(animalComponent);
        return animalComponent;
    }

    @Override
    public AnimalComponent remove(AnimalComponent animalComponent){
        animalComponents.remove(animalComponent);
        return animalComponent;
    }

    @Override
    public String toString() {
        return toString(0);
    }

    @Override
    public String toString(int indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(getIndention(indent));
        builder.append(print(this));
        for(AnimalComponent animalComponent : animalComponents){
            builder.append(animalComponent.toString(indent + 4));
        }
        return builder.toString();
    }


}
