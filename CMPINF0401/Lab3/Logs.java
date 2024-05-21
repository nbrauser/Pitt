import java.util.Scanner;
public class Logs {
    public static void main(String[] args) {
        Scanner inScan = new Scanner(System.in);
        int logBase;
        int x;
        int count = 0;
        int divide;
        do{
            System.out.print("Please enter the log base: ");
            logBase = inScan.nextInt();
            inScan.nextLine();
            System.out.print("Please enter the int for X: ");
            x = inScan.nextInt();
            inScan.nextLine();
            divide = x;
            count = 0;
            if(logBase > 1 && x > 0) {
                do {
                    divide = divide / logBase;
                    count++;
                } while (logBase <= divide);
                System.out.println("Log base " + logBase + " of " + x + " is " + count);
            }
        }while (logBase > 1 && x > 0);
    }
}
