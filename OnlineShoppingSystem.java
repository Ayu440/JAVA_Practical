class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

public class OnlineShoppingSystem {
    private static int availableStock = 10;

    public static void buyProduct(int quantity) throws OutOfStockException {
        if (quantity > availableStock) {
            throw new OutOfStockException("Order Failed! Only " + availableStock + " items left in stock.");
        } else {
            availableStock -= quantity;
            System.out.println("Order Confirmed! You bought " + quantity + " item(s).");
            System.out.println("Remaining Stock: " + availableStock);
        }
    }

    public static void main(String[] args) {
        try {
            buyProduct(4);
            buyProduct(8);
        } catch (OutOfStockException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
