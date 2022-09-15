public class Assignment {


  public static void main(String[] args) {
    Food product1 = new Food();
    System.out.println(product1.food("rice",20,5,10));
    Food product2 = new Food();
    System.out.println(product2.food("beans",10,2,30));

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
