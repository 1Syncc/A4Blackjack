import java.util.*;

class Main {
  
    static int[] startCards = new int[2];
    static int[] userCards = new int[100];
    static int[] compCards = new int[100];

  public static void rules(){

    System.out.println("");
    System.out.println("Here Are The Rules of The Game!");
    System.out.println("");
    System.out.println("-----------------BLACKJACK-----------------");
    System.out.println("         You start with 2 cards.");
    System.out.println("   You can hit to get more cards or stay.");
    System.out.println("          If you get 21 you win! ");
    System.out.println("      But if you get over 21 you lose.");
    System.out.println(   "If the dealer gets a higher score you lose");
    System.out.println("-------------------------------------------");
    System.out.println("");

  }// end of rules method
  
  public static void userBet(int balance, int bet){
    Scanner sin = new Scanner(System.in);
    
    balance = 100;
    
    System.out.println("");
    System.out.println("------------------Betting------------------");
    System.out.println("Your balance is: $" + balance);
    System.out.println("");
    
    do {

    

    System.out.println("How much would you like to bet?");
    bet = sin.nextInt();
    sin.nextLine();

    if (bet > balance) {
      System.out.println("");
      System.out.println("Error: bet bigger than balance");
      System.out.println("");
    } else{

      break;

    }
    
    }while(true);
    balance -= bet;
    System.out.println("You have bet $" + bet + "!"); 
    System.out.println("");
    System.out.println("-------------------------------------------");
    System.out.println("");
  }// end of balance method

public static void cardLoop(){

      int min = 1;
      int max = 10;

      for(int i = 0; i < startCards.length; i++){

      startCards[i] = (int)(Math.random() * (max - min + 1) + min);

    }

  }


// Random Number Generator Method for User
  public static void userRNG(){
    cardLoop();
    
    int min = 1;
    int max = 10;
      
    for(int i = 0; i < userCards.length; i++){ 
    userCards[i] = (int)(Math.random() * (max - min + 1) + min);
    }

     System.out.println("Your cards are: " + startCards[0] + " and " + startCards[1]);
     System.out.println("");

  }//end of userRNG method

  public static void compRNG(){

    int min = 1;
    int max = 10;
      
    for(int i = 0; i < userCards.length; i++){ 
    compCards[i] = (int)(Math.random() * (max - min + 1) + min);
    }
    
     System.out.println("The dealer has a: " + compCards[0]);
     System.out.println("");
  

  }//end of userRNG method

  public static void hitOrStay(){
    Scanner sin = new Scanner(System.in);

    String userHOS;
    
    System.out.println("Would you like to hit or stay?");
    userHOS = sin.nextLine();

    if(userHOS.equalsIgnoreCase("Hit")){

    for(int i = 0; i < userCards.length; i++){ 
 
      System.out.println("You got a " + userCards[i]);

    }// end of for loop
    }//end of if statement
    
  }// end of game method

  public static void main(String[] args) {
    
  do{ 
    rules();
    userBet(1, 2);
    System.out.println("The game has started, good luck!");
    System.out.println("");
    userRNG();
    compRNG();
    hitOrStay();
    break;
  }while(true);
  }// end of main method

}// end of class