package LLD.PizzaMaker;

public enum BaseSize {
    SMALL(200),
    MEDIUM(500),
    LARGE(1000);

    private int price;

    private BaseSize(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
