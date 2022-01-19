import java.util.*;

class Main {
  
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

// Random Number Generator Method for User
  public static void startCards(int num1, int num2, int num3){

    int min = 1;
    int max = 10;
      
      num1 = (int)(Math.random() * (max - min + 1) + min);
      num2 = (int)(Math.random() * (max - min + 1) + min);
      num3 = (int)(Math.random() * (max - min + 1) + min);

     System.out.println("Your cards are: " + num1 + " and " + num2);
     System.out.println("");
     System.out.println("The dealer has a: " + num3);
  

  }//end of userRNG method

  public static void hitOrStay(){
    startCards(1, 2, 3);
    

    
  }// end of game method

  public static void main(String[] args) {
    
  do{ 
    rules();
    userBet(1, 2);
    System.out.println("The game has started, good luck!");
    System.out.println("");
    game();
    break;
  }while(true);
  }// end of main method

}// end of class