package bridge;

public class Rock {

    private String name;
    private RockType rockType;
    private String visualDescription;
    private Integer mohsScale;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RockType getRockType() {
        return rockType;
    }

    public void setRockType(RockType rockType) {
        this.rockType = rockType;
    }

    public String getVisualDescription() {
        return visualDescription;
    }

    public void setVisualDescription(String visualDescription) {
        this.visualDescription = visualDescription;
    }

    public Integer getMohsScale() {
        return mohsScale;
    }

    public void setMohsScale(Integer mohsScale) {
        this.mohsScale = mohsScale;
    }
}
