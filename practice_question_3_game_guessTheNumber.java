package com.company;

/*Program Statement (question)
Create a class Game, which allows a user to play "Guess The Number" game once. Game should have the following methods
1.constructor to generate the random number
2.function take user input
3. iscorrectnumer() to detect weather the no entered by the user is true
4. use property such as no. of guesses etc to get this task done!
5. use getter and setter for no. of guesses
 */

import java.util.Random;
import java.util.Scanner;

class Game{
    int score;
    int rn;
    Random random = new Random();
    public Game(){
        rn = random.nextInt(100);
        score = 0;
    }
    public boolean play(int ui){
        if(ui == rn){
            System.out.println("You Guessed Correct ! The number was "+rn);
            return false;
        }
        else if(ui>rn){
            System.out.println("Your entered number is greater than the Secret Number.");
            score++;
            return true;
        }
        else{
            System.out.println("Your entered number is less than the Secret Number.");
            score++;
            return true;
        }
    }
    public int getScore(){
        return score;
    }
}

public class practice_question_3_game_guessTheNumber {
    public static void main(String[] args) {
        boolean x=true;
        Scanner mainScan = new Scanner(System.in);
        while(x){
            Game game = new Game();
            boolean c = true;
            while(c){
                Scanner scan = new Scanner(System.in);
                System.out.print("Enter Your Guess : ");
                int z;
                try {
                    z = scan.nextInt();
                }
                catch(Exception e){
                    System.out.println("Invalid input Please Try again!");
                    continue;
                }
                c = game.play(z);
            }
            System.out.println("You took "+game.getScore()+" turns to guess the number");
            System.out.print("Enter Y to play again , anything else to close : ");
            String h = mainScan.next();
            if(h.equals("Y")){
                continue;
            }
            else{
                x = false;
            }
        }
    }
}
