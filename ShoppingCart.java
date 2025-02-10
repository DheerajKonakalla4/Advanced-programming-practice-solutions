import java.util.Random;

public class ShoppingCart {
    private double[] prices;
    private Random random;

    public ShoppingCart(int capacity) {
        this.prices = new double[capacity];
        this.random = new Random();
    }

    // Task 1: Create a double array to store product prices
    public void initializeCart() {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = 0.0;
        }
    }

    // Task 2: Simulate adding products to the cart by populating the array with random prices
    public void addProduct(int index) {
        if (index >= 0 && index < prices.length) {
            prices[index] = random.nextDouble() * 100; // random price between 0 and 100
        }
    }

    // Task 3: Simulate removing products by setting the price to 0
    public void removeProduct(int index) {
        if (index >= 0 && index < prices.length) {
            prices[index] = 0.0;
        }
    }

    // Task 4: Calculate and print the total price of items in the cart
    public void calculateTotalPrice() {
        double totalPrice = 0.0;
        for (double price : prices) {
            totalPrice += price;
        }
        System.out.println("Total price: " + totalPrice);
    }

    // Additional Task: Implement a method to find the most expensive and least expensive item in the cart
    public void findMostAndLeastExpensive() {
        double mostExpensive = 0.0;
        double leastExpensive = Double.MAX_VALUE;
        for (double price : prices) {
            if (price > mostExpensive) {
                mostExpensive = price;
            }
            if (price > 0 && price < leastExpensive) {
                leastExpensive = price;
            }
        }
        System.out.println("Most expensive item: " + mostExpensive);
        System.out.println("Least expensive item: " + leastExpensive);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(10);
        cart.initializeCart();

        // Add some products to the cart
        cart.addProduct(0);
        cart.addProduct(1);
        cart.addProduct(2);
        cart.addProduct(3);
        cart.addProduct(4);

        // Remove a product from the cart
        cart.removeProduct(2);

        // Calculate and print the total price
        cart.calculateTotalPrice();

        // Find and print the most expensive and least expensive item
        cart.findMostAndLeastExpensive();
    }
}
