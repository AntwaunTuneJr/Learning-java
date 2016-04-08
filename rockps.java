import java.util.Random;
import java.util.Scanner;

class RockPaperScisors {
    public static int rpsRandom(int[] array) {
        int rand = new Random().nextInt(array.length);
        return array[rand];
    }
    public static void main(String args[]) {
        int[] computer_choices = {0,1,2};
        int computer_choice = rpsRandom(computer_choices);
        /*switch (computer_choice) {
            case 0: if(user_choice)
            
            
        } */
        System.out.println(computer_choice);
    }
}
