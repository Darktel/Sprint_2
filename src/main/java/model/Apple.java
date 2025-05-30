package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable{
    private String colour;

    public Apple(int amount, double price, String colour, boolean isVegetarian) {
        super(amount, price, isVegetarian);
        this.colour = colour;
    }

    // Здесь неявное приведение типа из INT в DOUBLE.
    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.RED_APPLE;
        } else {
            return Discount.DEFAULT;
        }
    }
}
