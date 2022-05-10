package pastCampus.hello.design.decorator;

public class Audi implements ICar {

    private int cost;

    public Audi(int price) {
        this.cost = price;
    }

    @Override
    public int getPrice() {
        return cost;
    }

    @Override
    public void showPrice() {
        System.out.println("Audi cost = " + cost);
    }
}
