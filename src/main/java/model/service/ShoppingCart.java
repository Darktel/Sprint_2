package model.service;

import model.Food;

public class ShoppingCart {
    private Food[] food;
    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getSumWithoutDiscount() {
        double sum = 0;
        for (Food value : food) {
            sum += value.getTotalPrice();
        }
        return sum;
    }

    public double getSumWithDiscount() {
        double sum = 0;
        for (Food food : this.food) {
            sum += food.getTotalPriceWithDiscount();
        }
        return sum;
    }

    public double getSumVegetarianWithoutDiscount() {
        double sum = 0;
        for (Food food : this.food) {
            if (food.isVegetarian()) {
                sum += food.getTotalPrice();
            }
        }
        return sum;
    }
}
