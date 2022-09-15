public class Assignment {


  public static void main(String[] args) {
    Food rice = new Food();
    System.out.println(rice.food("rice",20,5,10));
    Food beans = new Food();
    System.out.println(beans.food("beans",10,2,30));
   /* if (miles > 5 && miles <= 15) {
      System.out.println(total + 2);
    } else if (miles > 16 && miles <= 25) {
      System.out.println(total + 10);
    } else if (miles > 26 && miles <= 50) {
      System.out.println(total + 15);
    } else {
      System.out.println(total + 20);
    */
    // 5 - 15 miles  = $5
    //16 - 25 miles  = $10
    //26 - 50	miles  = $15
    //More than 50 miles = $20

    /// Question 1 //https://www.youtube.com/watch?v=IUqKuGNasdM



    char[] aphalbets = {'a','b', 'c', 'd', 'e', 'f','g','h', 'i', 'j', 'k', 'l','m', 'n', 'o','p', 'q', 'r', 's', 't', 'u', 'v','y', 'x', 'z'};
    System.out.println(aphalbets[22]);
    aphalbets[0] = '$';
    System.out.println(aphalbets[22]);
    int i;
    for(i = 0; i < aphalbets.length; i++){
     if (aphalbets[i] != 'y'){
       System.out.println(aphalbets[i]);
     }
    }
    int x = 20;
    // my resourse https://tutorialsinhand.com/tutorials/java-programs/java-loop-programs/java-program-to-print-1-20.aspx
    while (x <= 20) {
    if (x >= 10)
      System.out.println(x--);
    }
  }
}
