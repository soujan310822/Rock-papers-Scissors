import java.util.Random;
import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        String str[] = {"rock", "paper", "scissor"};
        String playersChoice;
        String computersChoice;
        int playerScore=0,computerScore=0;
        int count;
        System.out.print("Enter number of rounds you want to play: ");
        count=input.nextInt();
        input.nextLine();
        do {
            System.out.print("Enter your choice (rock,paper,scissor): ");
            playersChoice = input.nextLine().toLowerCase();
            if(!(playersChoice.equals("rock")||playersChoice.equals("paper")||playersChoice.equals("scissor"))){
                System.out.println("Invalid choice");
                continue;
            }
            computersChoice = str[rand.nextInt(3)];
            System.out.println("Computer's Choice is : " + computersChoice);
           if((playersChoice.equals("rock")&&computersChoice.equals("scissor"))||
                   (playersChoice.equals("paper")&&computersChoice.equals("rock"))||
                   (playersChoice.equals("scissor")&&computersChoice.equals("paper"))) {
               System.out.println("You WIN!!😛");
               playerScore++;
           }
           else if (playersChoice.equals(computersChoice)) {
               System.out.println("Its a TIE!!😝");
           }
           else {
               System.out.println("You Lose!!😢");
               computerScore++;
           }
           count--;
        } while (count !=0);
        Score scr1=new Score(playerScore,computerScore);


    }
}
