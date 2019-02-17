package composite;

public class Animal extends AnimalComponent {

    public Animal(String name, String taxonomicRank, String comment){
        this.name = name;
        this.taxonomicRank = taxonomicRank;
        this.comment = comment;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        return builder.toString();
    }


    @Override
    public String toString(int indent) {
        StringBuilder builder = new StringBuilder();
        builder.append(getIndention(indent));
        builder.append(print(this));
        return builder.toString();    }
}
