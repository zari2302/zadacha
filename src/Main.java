import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        String v = scanner.nextLine();
        switch (v){
            case "1":
                System.out.println("sabaka kirishuu");
                break;
            case "2":
                System.out.println("ozgormolor");
                break;
            case "3":
                System.out.println("matemetikalyk operasialar");
                break;
            case "4":
                System.out.println("uslovnye operatory");
            default:
                System.out.println("vyhodnoi");*/
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        if (v > 5) {
            System.out.println("mynday kun jok");
        } else
            System.out.print("bugun:");
        switch (v) {
            case 1:
                System.out.println("sabaka kirishuu");
                break;
            case 2:
                System.out.println("ozgormolor");
                break;
            case 3:
                System.out.println("matemetikalyk operasialar");
                break;
            case 4:
                System.out.println("uslovnye operatory");
            case 5:
                System.out.println("s.sh");
            default:
                System.out.println("vyhodnoi");
        }
    }
}