package adapter;

public class FlygplanAirplaneAdapter implements Airplane {

    private Flygplan instance;

    public FlygplanAirplaneAdapter(Flygplan instance) {
        this.instance = instance;
    }

    @Override
    public String getName() {
        return instance.getNamn();
    }

    @Override
    public void setName(String name) {
        this.instance.setNamn(name);
    }

    @Override
    public Integer getPrice() {
        return this.instance.getPris();
    }

    @Override
    public void setPrice(Integer price) {
        this.instance.setPris(price);
    }
}
