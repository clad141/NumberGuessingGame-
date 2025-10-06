import java.util.*;
public class NumberGuessingGame {
    public static void guessingGame(int max,int min){
    Scanner scanner = new Scanner(System.in);
    boolean isguessing = true;
    int attempts = 1;
    System.out.print("Enter number of attempts:");
    int noOfAttempts = scanner.nextInt();
    //Computer now select another btwn the min and the max
    int number = (int)Math.floor((Math.random()*(max-min))+min +1);
    while(isguessing){
        System.out.println("**************************************************");
        System.out.print("Enter your guess:");
        int guess = scanner.nextInt();
        //Make decision and compare the guess and the random number
        if(guess == number){
            System.out.println("Correct guess.");
            isguessing = false;
        }else if(guess > number){
            System.out.println("Very high.");
        }else if(guess < number){
            System.out.println("Too low.");
        }
        //Attempts regulator when the attempts matches no of attempts
        //Then we exit the loop even if the guess is not correct
        if(noOfAttempts == attempts){
            System.out.println("Zero attempts remaining:");
            break;
        }else{
            System.out.println(noOfAttempts - attempts +" Attempts remaining.");
        }
        attempts ++;
        }
        //The computer then display total attempts and the random number
        System.out.println("The number is:" + number);
        System.out.println("Total attempts:"+ (attempts-1));
        System.out.println("**************************************************");
        
    }
    public static void main(String[] args) {
        //User to enter a maximum and minimum number
        System.out.print("**************NUMBER GUESSING GAME*****************\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number btwn the max and minimum:");
        System.out.print("Enter the maximum number:");
        int max = scanner.nextInt();
        System.out.print("Enter the minimum number:");
        int min = scanner.nextInt();
        if(min > max){
            max = min;
            guessingGame(max,min);
        }else if(max == min){
            System.out.print("Invalid format:");
        }else{
            guessingGame(max,min);
        }
    }
}