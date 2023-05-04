import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        char randomLetter;
        String userGuess;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int index= r.nextInt(26);
        boolean correct = false;
        String userInput;
        boolean quit = false;

        do {
            randomLetter = alphabet.charAt(index);
            quit = false;
            correct = false;
            do {
                System.out.println("Please guess a letter");
                userGuess = input.nextLine();
                int userGuessIndex = alphabet.indexOf(userGuess);
                correct = true;
                if (userGuessIndex == index) {
                    System.out.println("Correct!");

                } else if (userGuessIndex < index) {
                    System.out.println("Sorry, wrong answer");
                } else {
                    System.out.println("Wrong go towards a");
                }
            } while (!correct);
            System.out.println("Nice job, do you want to play again? Y/N");
            userInput = input.nextLine();
            if(userInput.equalsIgnoreCase("n")){
                quit = true;
                correct = false;
            }
        }while(!quit);

    }
}