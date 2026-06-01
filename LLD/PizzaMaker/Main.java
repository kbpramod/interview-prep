package LLD.PizzaMaker;

public class Main {
    
    public static void main(String[] args) {
        Pizza pizza =  new Pizza.Builder()
                        .size(BaseSize.SMALL)
                        .addToppings(Topping.CHEESE, 5)
                        .build();

        int price = pizza.getPrice();

        System.out.println(price);
    }
}
