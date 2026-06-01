package LLD.PizzaMaker;

import java.util.*;

public class Pizza {
    
    private BaseSize size;
    private Map<Topping, Integer> toppings;


    public Pizza(Builder builder) {
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public static class Builder {
            
        private BaseSize size;
        private Map<Topping, Integer> toppings = new HashMap<>();

        public Builder size(BaseSize size) {
            this.size = size;
            return this;
        }

        public Builder addToppings(Topping topping, Integer quantity) {
            this.toppings.put(topping, quantity);
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }


    public int getPrice() {
        int baseprice = this.size.getPrice();
        int toppingsPrice = 0;

        for(Map.Entry<Topping, Integer> entry: toppings.entrySet()) {
            Topping topping = entry.getKey();
            Integer quantity = entry.getValue();

            toppingsPrice += topping.getPrice() * quantity;
        }

        return baseprice + toppingsPrice;
    }
}
