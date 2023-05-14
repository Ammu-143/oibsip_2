import java.util.*;
import java.util.Random.*;

class task2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double r, num;
        System.out.println("System generates random number");
        r = Math.ceil(Math.random() * 100);
        int flag = 0, score = 0, limit;
        System.out.println("enter the number of limits for the number guessing game");
        limit = sc.nextInt();
        while (limit > 0) {
            System.out.println("enter your number");
            num = sc.nextDouble();
            if (num == r) {
                System.out.println("Generated random number is" + r);
                score = score + 100;
                System.out.println("your score is" + score);
                flag = 1;
                limit--;
                break;

            } else if (num > r) {
                System.out.println("generated number is less than " + num);
                System.out.println("Try another number");
                score = score - 10;
                limit--;

            } else if (num < r) {
                System.out.println("generated number is greater than " + num);
                System.out.println("Try another number");
                score = score - 10;
                limit--;

            }

        }
        if (flag == 0) {
            System.out.println("Sorry,better luck next time");
            System.out.println("Generated number is " + r);
            System.out.println("your score is " + score);

        }

    }
}
