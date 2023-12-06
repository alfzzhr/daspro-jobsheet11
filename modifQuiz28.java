import java.util.Random;
import java.util.Scanner;

public class modifQuiz28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        char menu;

        do {
            int number = random.nextInt(10) + 1;

            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = input.nextInt();
                input.nextLine();

                if (answer < number) {
                    System.out.println("Tebakan Anda terlalu kecil.");
                } 
                if (answer > number) {
                    System.out.println("Tebakan Anda terlalu besar.");
                }

                System.out.println("Apakah Anda ingin mengulang permainan? (Y/T)");
                menu = input.next().charAt(0);
                input.nextLine();
            } while (menu == 'Y' || menu == 'y');

            System.out.println("Terima kasih telah bermain!");
        } while (menu == 'Y' || menu == 'y');
    }
}
