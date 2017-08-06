import java.util.Scanner;

/**
 * Rock Paper Scissor Game
 * @author Brad Theodore brad.theodore@gmail.com    
 */
public class rockPaperScissor 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // declarations
        Scanner in = new Scanner(System.in);
        String ROCK = "R";
        String Paper = "P";
        String Scissors = "S";
        String PlayerOne = "Z";
        String PlayerTwo = "Z"; 
        String ContinueGame = "Y";
        
        //continue game while user enters Y
        while (ContinueGame.equalsIgnoreCase("Y"))
        {    
            // Game intro
    
            System.out.println("Let's Play Rock, Paper, Scissors");
            // prompt Player One selection
            System.out.print("Player One- Choose Rock, Paper or Scissors [R, P, S]: ");
            
            //restrict input to RPSrps only, loop until valid
            while(!in.hasNext("[RPSrps]"))
            {
                System.out.print("Try Again, You Must Enter Rock, Paper or Scissors [R, P, S]: ");
                in.nextLine();
            }
            PlayerOne = in.nextLine();
           
            // prompt Player Two selection
            System.out.print("Player Two- Choose Rock, Paper or Scissors [R, P, S]: ");
            
            //restrict input to RPSrps only, loop until valid
            while(!in.hasNext("[RPSrps]"))
            {
                System.out.print("Try Again, You Must Enter Rock, Paper or Scissors [R, P, S]: ");
                in.nextLine();
            }
            PlayerTwo = in.nextLine();


            //Player one winning scenarios
            if (PlayerOne.equalsIgnoreCase("R") && PlayerTwo.equalsIgnoreCase("S"))
            {
                System.out.println("Rock Breaks Scissors, Player One Wins!");
            }
            else if (PlayerOne.equalsIgnoreCase("P") && PlayerTwo.equalsIgnoreCase("R"))   
            {
                System.out.println("Paper covers Rock, Player One Wins!");
            }
            else if (PlayerOne.equalsIgnoreCase("S") && PlayerTwo.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cut Paper, Player One Wins!");
            }
            // Player Two Winning Scenarios
            else if (PlayerTwo.equalsIgnoreCase("R") && PlayerOne.equalsIgnoreCase("S"))
            {
                System.out.println("Rock Breaks Scissors, Player Two Wins!");
            }
            else if (PlayerTwo.equalsIgnoreCase("P") && PlayerOne.equalsIgnoreCase("R"))
            {
                System.out.println("Paper covers Rock, Player Two Wins!");
            }
            else if (PlayerTwo.equalsIgnoreCase("S") && PlayerOne.equalsIgnoreCase("P"))
            {
                System.out.println("Scissors cut Paper, Player Two Wins!");
            }
            // Tying Scenarios
            else if (PlayerOne.equalsIgnoreCase("R") && PlayerTwo.equalsIgnoreCase("R"))
            {
                System.out.println("Rock vs Rock. It's a Tie!");
            }
            else if (PlayerOne.equalsIgnoreCase("P") && PlayerTwo.equalsIgnoreCase("P"))
            {
                System.out.println("Paper vs Paper. It's a Tie!");
            }
            else if (PlayerOne.equalsIgnoreCase("S") && PlayerTwo.equalsIgnoreCase("S"))
            {
                System.out.println("Scissors vs Scissors. It's a Tie");
            }

            // Prompt user to play again
            System.out.println("Do you want to play again [Y/N]: ");
            ContinueGame = in.nextLine();
        }
        

    }
    
}
