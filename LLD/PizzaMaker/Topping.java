package LLD.PizzaMaker;

public enum Topping {
    CHEESE(250),
    ONION(150),
    CAPSICUM(100);

    private int price;

    private Topping(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
