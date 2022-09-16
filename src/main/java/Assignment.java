public class Assignment {

   //a static method
  public static String printReceipt(String product, double qty, double price, double miles) {
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
    }
    // return data type is a string so you need to return ""
    return "product :" + product + "\n" + "Qty :" + qty + "\n" + "price :" + price + "\n" + "miles :" + miles + "\n" + "==========" + "\n" + "total:" + total;
  }

  // declared somethings i know i will use and need - qty, miles, price, product, total
/*
int qty;
double miles;
double price;
String product;
double total;



*/
// A loop, a variable, need objects, if statement, another class
// a method becomes a recipe of instructions
  public static void main(String[] args) {

    String str = "yearup wilmigton";
    System.out.println(str.substring(4));
    System.out.println(str.substring(4,10));



    String returnedValue = printReceipt("cake",200,5.75,102.78);
    System.out.println(returnedValue);


   // Food product1 = new Food();
    //System.out.println(product1.food("rice",20,5,10));
    //Food product2 = new Food();
    //System.out.println(product2.food("beans",10,2,30));

    // 5 - 15 miles  = $5
    //16 - 25 miles  = $10
    //26 - 50	miles  = $15
    //More than 50 miles = $20

    /// Question 1 //https://www.youtube.com/watch?v=IUqKuGNasdM



    char[] aphalbets = {'a','b', 'c', 'd', 'e', 'f','g','h', 'i', 'j', 'k', 'l','m', 'n', 'o','p', 'q', 'r', 's', 't', 'u', 'v','x', 'y', 'z'};
    System.out.println(aphalbets[aphalbets.length - 2]);
    aphalbets[0] = '$';
    System.out.println(aphalbets[22]);
    int i;
    for(i = 0; i < aphalbets.length; i++){
     if (aphalbets[i] != 'y'){
       System.out.println(aphalbets[i]);
     }// contiune; to skip a if stament
    }
    int x = 21;
    // my resourse https://tutorialsinhand.com/tutorials/java-programs/java-loop-programs/java-program-to-print-1-20.aspx
    while (x >= 10) {
      System.out.println(x--);
    }
  }
}
