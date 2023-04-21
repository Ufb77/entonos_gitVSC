import java.util.Scanner;

public class EJ1 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String callate;

        System.out.println("¿Te puedes callar?");
        callate  = sc.nextLine();

        if (callate.equalsIgnoreCase("si")) {
            System.out.println("Si me puedo callar");

        }else{
            System.out.println("No puedo gracias");

        }

        sc.close();
    }
}
