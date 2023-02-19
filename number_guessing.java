import java.util.*;
class game{
    int AI;
    public game(){
        Random randm = new Random();
        AI = randm.nextInt(100);
        System.out.println("Game of guessing the number.");
        System.out.println();
    }
    public int AIno(){
        return AI;
    }
}
public class number_guessing{
    static int takeUserInput(){
        int user;
        System.out.println("Enter the number");

        Scanner sc = new Scanner(System.in);

        user = sc.nextInt();
        return user;
        
    }
    static void isCorrectNumber(int m, int n){
        if(m==n){
            System.out.println("You guess the correct number");
            System.out.println();
        }
        else if(m>n){
            System.out.println("The number you guess is bigger than the AI number");
            System.out.println();
        }
        else{
            System.out.println("The number you guess is smaller than the AI number");
            System.out.println();
        }
    }
    public static void main(String args[]){
        int user = 0, AI = 0, iteration = 0;
        game g = new game();
        do{
            user = takeUserInput();
            AI = g.AIno();
            isCorrectNumber(user, AI);
            iteration++;
        }while(user!=AI);
        System.out.println("You guess the correct number in "+iteration+" iteration");
    }
}