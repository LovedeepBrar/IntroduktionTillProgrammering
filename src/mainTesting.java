
import java.util.Scanner;

public class mainTesting {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Words words = new Words();

        System.out.println("Skriv valfria ord, för att avsluta skriv stopp");
        while (!words.isStopped()) {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("stop")){
                words.setStopped((true));
            }
            else {
                words.calculate(input);
            }

            words.print();
        }
    }
}
