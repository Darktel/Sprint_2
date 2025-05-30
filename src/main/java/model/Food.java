package model;


import model.constants.Discount;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
        this.amount = amount;
        this.price = price;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public int getAmount() {
//        return amount;
//    }


    public boolean isVegetarian() {
        return isVegetarian;
    }

    // Здесь неявное приведение типа из INT в DOUBLE.
    @Override
    public double getDiscount() {
        return Discount.DEFAULT;
    }

    public double getTotalPrice() {
        return price * amount;
    }

    public double getTotalPriceWithDiscount() {
        return getTotalPrice() * (1 - getDiscount() / 100);
    }
}
