
import java.util.Random;
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Random ran = new Random();
        int target = ran.nextInt(100);
        System.out.println("Guess the number between 1 to 100: ");
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int attempts = 1;
        System.out.println("Welcome to number guessing game: ");
        System.out.println("Player 1's turn: ");
        while(input!=target){
            input = sc.nextInt();
            if(input == target){
                System.out.println("target found number of attempts it took is "+attempts);
                break;
            }
            else if(input<target){
                System.out.println("sorry try again its less than target attempts you have made are "+attempts);
            }
            else{
                System.out.println("sorry try again its greater than target attempts you have made are "+attempts);
            }
            attempts++;
        }
        System.out.println("Player 2's turn: ");
         Random rand = new Random();
         int target1 = rand.nextInt(100);
         int input1 = 0;
        int attempts1 = 1;
        while(input1!=target1){
            input1 = sc.nextInt();
            if(input1 == target1){
                System.out.println("target found number of attempts it took is "+attempts1);
                break;
            }
            else if(input1<target1){
                System.out.println("sorry try again its less than target attempts you have made are "+attempts1);
            }
            else{
                System.out.println("sorry try again its greater than target attempts you have made are "+attempts1);
            }
            attempts1++;
        }
        if(attempts>attempts1) System.out.println("since player 2 took "+attempts1+" attempts to guess right so he won");
        else if(attempts==attempts1) System.out.println("its a draw");
        else{
            System.out.println("since player 1 took "+attempts+" attempts to guess right so he won");
        }
        sc.close();
    }
}