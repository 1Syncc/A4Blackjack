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

    balance -= bet;
    
    }while(true);
    System.out.println("You have bet $" + bet + "!");
    System.out.println("");
    System.out.println("-------------------------------------------");
    System.out.println("");
  }// end of balance method

// Random Number Generator Method for User
  public static void userRNG(){

    int[] userNum = new int[50];
    int min = 1;
    int max = 10;

    for(int i = 0; i < userNum.length; i++){
      
      userNum[i] = (int)(Math.random() * (max - min + 1) + min);
      
    }//end of loop
  

  }//end of userRNG method

// Random Number Generator Method for Computer
  public static void compRNG(){

    int[] compNum = new int[50];
    int min = 1;
    int max = 10;

    for(int i = 0; i < compNum.length; i++){
      
      compNum[i] = (int)(Math.random() * (max - min + 1) + min);
      
    }//end of loop

  }// end of compRNG method

  public static void game(){

    userRNG();
    compRNG();
    
  }// end of game method

  public static void main(String[] args) {
    
    rules();
    userBet(1, 2);
    game();
  }// end of main method

}// end of class