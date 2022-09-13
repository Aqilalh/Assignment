public class Food {
    // int miles = 0;
    double miles = 100;
    double fee;

    String product;
    double price;
    int Qty;

    public double Food(String product, int qty, double price, double miles) {
        this.product = product;
        this.price = price;
        this.Qty = qty;
        this.miles = miles;

        for (int i = 0; i < miles; i++) {
            if (i >= 4) {
                System.out.println(fee = 2);
            } else {
                if (i >= 5 && i <= 15) {
                    System.out.println(fee = 5);
                } else if (i >= 16 && i <= 25) {
                    System.out.println(fee = 10);
                } else if (i >= 26 && i <= 50) {
                    System.out.println(fee = 15);
                } else if (i >= 50) {
                    System.out.println(fee = 20);
                }
            }

        }

        return total;
    }
}