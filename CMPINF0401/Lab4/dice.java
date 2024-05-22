import java.util.Objects;
import java.util.Scanner;
import java.util.Random;
public class dice {
    public static void roll(int rolls, Random ran){
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int eleven = 0;
        int twelve = 0;
        int die1;
        int die2;
        int total;
        for(int x = rolls; x > 0; x--){
            die1 = ran.nextInt(6) + 1;
            die2 = ran.nextInt(6) + 1;
            total = die2 + die1;
            if (total == 2){
                two++;
            }
            else if (total == 3){
                three++;
            }
            else if (total == 4){
                four++;
            }
            else if (total == 5){
                five++;
            }
            else if (total == 6){
                six++;
            }
            else if (total == 7){
                seven++;
            }
            else if (total == 8){
                eight++;
            }
            else if (total == 9){
                nine++;
            }
            else if (total == 10){
                ten++;
            }
            else if (total == 11){
                eleven++;
            }
            else {
                twelve++;
            }
        }
        System.out.println("Rolled two " + two + "/" + rolls + " of the time.");
        System.out.println("Rolled three " + three + "/" + rolls + " of the time.");
        System.out.println("Rolled four " + four + "/" + rolls + " of the time.");
        System.out.println("Rolled five " + five + "/" + rolls + " of the time.");
        System.out.println("Rolled six " + six + "/" + rolls + " of the time.");
        System.out.println("Rolled seven " + seven + "/" + rolls + " of the time.");
        System.out.println("Rolled eight " + eight + "/" + rolls + " of the time.");
        System.out.println("Rolled nine " + nine + "/" + rolls + " of the time.");
        System.out.println("Rolled ten " + ten + "/" + rolls + " of the time.");
        System.out.println("Rolled eleven " + eleven + "/" + rolls + " of the time.");
        System.out.println("Rolled twelve " + twelve + "/" + rolls + " of the time.");
    }
    public static void main(String[] args) {
        String rerun;
        do {
            Scanner inScan = new Scanner(System.in);
            System.out.print("How many times would you like to roll: ");
            int x = inScan.nextInt();
            inScan.nextLine();
            Random R = new Random();
            roll(x, R);
            System.out.print("Type y to Roll again: ");
            rerun = inScan.next();
            inScan.nextLine();
        } while (Objects.equals(rerun, "y"));
    }

}
