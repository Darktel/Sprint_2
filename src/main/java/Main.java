
import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat product1 = new Meat(5, 100);
        Apple product2 = new Apple(10, 50, Colour.RED, true);
        Apple product3 = new Apple(8, 60, Colour.GREEN, true);
        Food[] products = {product1, product2, product3};
        ShoppingCart cart = new ShoppingCart(products);
        System.out.println("Сумма покупки без скидки: " + cart.getSumWithoutDiscount());
        System.out.println("Сумма покупки с скидкой: " + cart.getSumWithDiscount());
        System.out.println("Сумма вегетарианской покупки без скидки: " + cart.getSumVegetarianWithoutDiscount());
    }
}