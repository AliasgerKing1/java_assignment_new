package assignment19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Restaurant {
    public void placeOrder(String customerName, String item) {
        System.out.println(customerName + " placed an order for " + item);
    }

    public void prepareFood(String item) {
        System.out.println("Chef is preparing " + item);
        try {
            // Simulate food preparation time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Chef finished preparing " + item);
    }
}

class OrderProcessor implements Runnable {
    private Restaurant restaurant;
    private String customerName;
    private String item;

    public OrderProcessor(Restaurant restaurant, String customerName, String item) {
        this.restaurant = restaurant;
        this.customerName = customerName;
        this.item = item;
    }

    @Override
    public void run() {
        restaurant.placeOrder(customerName, item);
    }
}

class Chef implements Runnable {
    private Restaurant restaurant;
    private String item;

    public Chef(Restaurant restaurant, String item) {
        this.restaurant = restaurant;
        this.item = item;
    }

    @Override
    public void run() {
        restaurant.prepareFood(item);
    }
}

public class assignment19 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Customers placing orders
        executor.submit(new OrderProcessor(restaurant, "Customer1", "Burger"));
        executor.submit(new OrderProcessor(restaurant, "Customer2", "Pizza"));
        executor.submit(new OrderProcessor(restaurant, "Customer3", "Pasta"));

        // Chefs preparing food
        executor.submit(new Chef(restaurant, "Burger"));
        executor.submit(new Chef(restaurant, "Pizza"));
        executor.submit(new Chef(restaurant, "Pasta"));

        // Shutdown the executor service when all tasks are done
        executor.shutdown();
    }
}
