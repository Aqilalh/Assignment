public class practice {

    public static String printReceipt(String product ,double qty, double price, double miles) {

        // given a qty and price we nee to fidure out total
        //we need to figure out delivery fee
        //creat a set of conditions that uses the miles to charge customer fee
        float fee;
        double total = qty * price;
        if (miles <= 4) {
            // charge them $2
            fee = 2.00f;
            total = total + fee;
        } else if (miles > 4 && miles <= 15) {
            fee = 5.00f;
            total = total + fee;
        } else if (miles > 15 && miles <= 25) {
            fee = 10.0f;
        } else if (miles > 25 && miles <= 50) {
            fee = 15.0f;
            total = total + fee;
        } else {
            fee = 20.0f;
            total = total + fee;

        } String s = String.format("product  Qty   Price   miles   total\n ---      ---    ---     ---     ---\n%s     %.1f     %.1f   %.1f   ", product,qty,price,miles);
        return  s + total;
    }

//return String.format("Product %s,Qty \n %.1f,Price \n %.1f,total\n",product,qty,price,miles,total);
    //return "product :" + product + "\n" + "Qty :" + qty + "\n" + "price :" + price + "\n" + "miles :" + miles + "\n" + "==========" + "\n" + "total:" + total;
    public static void main(String[] args) {
        System.out.println(printReceipt("rice",20,5,10));
       // System.out.println(printReceipt("rice",20,5,10));
       // System.out.printf("my name is %s. I was born in the year %d ", "aqil", 20);
        //int age = 22;
       // String form = String.format("my age is %d", 30);
        //chapter 10 page 294
        // % acts like a variable
        //String s = String.format("%, d", 10000);
        //System.out.println(s);
        // .2f format specifiers for the seocnd argument to the method/ so basically it would bring whatever I put in the second method
        // to replace 2f. f = float
        //Product      Qty      Price       Miles      Total
        //			----         ---      -----      -----      -----
        //			Rice          20        5.0       10.0      105.0
       // String total = "";
        // A method that give us the total


      // String.format("product : %s","Qty:f","price :%f","miles :%f","total:%d","rice",20,5,10,total);
      //  System.out.println(product);

    }
}