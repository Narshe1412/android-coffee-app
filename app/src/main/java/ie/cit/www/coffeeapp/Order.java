package ie.cit.www.coffeeapp;

public class Order {

    private final int COFFEE_PRICE = 200;
    private String customerName;
    private boolean cbCream = false;
    private boolean cbChocolate = false;
    private int quantity = 0;

    public Order() {

    }

    /**
     * Obtain customer name
     *
     * @return a string value with the name of customer
     */
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public boolean isCbCream() {
        return cbCream;
    }

    public void setCbCream(boolean cbCream) {
        this.cbCream = cbCream;
    }

    public boolean isCbChocolate() {
        return cbChocolate;
    }

    public void setCbChocolate(boolean cbChocolate) {
        this.cbChocolate = cbChocolate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int increaseQuantity() {
        if (quantity < 10) {
            quantity++;
        }
        return quantity;
    }

    public int decreaseQuantity() {
        if (quantity >1) {
            quantity--;
        }
        return quantity;
    }

    public String getOrderSummary() {
        return "Order summary:" +
                "\nTotal amount of coffees: " + quantity +
                "\nPrice per coffee" + COFFEE_PRICE +
                "\nOrder total = " + COFFEE_PRICE * quantity / 100 + " EUR";
    }
}
